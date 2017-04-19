package com.example.administrator.myapplication.Activity;

import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.device.ScanManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.Bean.DbSheetLabelScan;
import com.example.administrator.myapplication.Bean.DbSheetScan;
import com.example.administrator.myapplication.Bean.Entruck;
import com.example.administrator.myapplication.Bean.ScanInput;
import com.example.administrator.myapplication.Bean.SheetScanRecordUpload;
import com.example.administrator.myapplication.Bean.Stockbean;
import com.example.administrator.myapplication.Interface.MyRetrofit;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Support.Base64Support;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;
import com.example.administrator.myapplication.Utils.Type;
import com.google.gson.Gson;

import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InformationActivity extends AppCompatActivity {
    private TextView tv_zong,tv_kucun,tv_time,tv_saoma;
    private CheckBox cb;
    private TextView tv,fab_shangchuan,fab_kuncun;
    private FloatingActionButton actionButton;
    private boolean fabopen = false;
    private static final String TAG = "zzz";
    private int loadshiftid;
    private int loadshopid;
    private ProgressDialog pd;
    private List<Stockbean> danhaolist = new ArrayList<>();
    private List<DbSheetScan> danHaos = new ArrayList<>();
    private ScanManager scanManager;
    private String barcodeStr;
    private boolean scanPowerState;
    private boolean lockTrigglerState;
    private boolean isScaning = false;
    private BroadcastReceiver mScanReceiver;
    private final static String SCAN_ACTION = "urovo.rcv.message";
    private String baseurl = "http://192.168.6.114:8480/T6/api/";
    private ListView lv;
    private MyAdapter myAdapter;
    private String str;
    private List<Entruck.DataBean.RowsBean> rowslist = new ArrayList<>();
    private String goodsname;
    private int totalGoodsAmount;
    private int totalStoreAmount;
    private int totalSheetAmount;
    private int num = 1;
    private int num_time;
    private DbManager dbManager;
    private int truckid;
    private String createdate;
    private String updatedate;
    private String formshopname;
    private int goodsamount;
    private int id;
    private String sheetno;
    private String sheetnoshort;
    private int storeamount;
    private String toshopname;
    private String sheetNoConsign;
    private String fromname;
    private String proname;
    private String toname;
    private List<DbSheetLabelScan> dbSheetLabelScanList;
    private List<ScanInput> scanInputList;
    private Retrofit retrofit;
    private String licensePlate;
    private int lineBranchId;
    private String lineBranchName;
    private int lineBranchNo;
    private int shopId;
    private String shopName;
    private int driverId;
    private String driverName;
    private String driverPhone;
    private DbSheetLabelScan dbSheetLabelScan;
    private DbSheetScan dbSheetScan;
    private int position;
    private int position_id;
    private String companyno;
    private String Trackingno;
    private int dbSheetScanId;
    private int proamount;
    private int amount = 0;
    private String scanLabel;
    private int nums;
    private List<String > list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        x.view().inject(this);

        initView();
        initGetIntentdata();


         retrofit = new Retrofit.Builder().baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient())
                .build();

        position_id = SharedPreferencesUtils.sharedGet(InformationActivity.this).getInt("id",20);
        companyno = SharedPreferencesUtils.sharedGet(InformationActivity.this).getString("companyNo",null);
        Log.i(TAG, "onCreate:    position "+position_id);

        initConfig();
        initTableExisit();
//        initData();//用来进行网络加载和数据库建表
//        initTable();//用来查询
//        initUpload();//上传操作

        mScanReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                isScaning = false;
                //条码值，条码长度，条码类型
                byte[] barocode = intent.getByteArrayExtra("barocode");
                int barocodelen = intent.getIntExtra("length", 0);
                byte temp = intent.getByteExtra("barcodeType", (byte) 0);
                barcodeStr = new String(barocode, 0, barocodelen);
                Log.i(TAG, "onReceive:  "+barcodeStr);
                str = barcodeStr.substring(0,barocode.length-4);
                scanLabel = SharedPreferencesUtils.sharedGet(InformationActivity.this).getString("str","1");
                Log.i(TAG, "onReceive:   scanlabel "+scanLabel);
                Trackingno = str.replace(62+companyno,"");
                Log.i(TAG, "onReceive:   "+Trackingno);
                Log.i(TAG, "onReceive:   "+str);
                try {

                    initTable();
                    list.add("");
                    //建立扫码的表
//                    DbSheetLabelScan scan = new DbSheetLabelScan();
//                    scan.setLabel(barcodeStr);
//                    scan.setTimestamp(getStringDate());
//                    scan.setStockId(dbSheetScanId);
//                    dbManager.saveBindingId(scan);
//                    Log.i(TAG, "onReceive:  扫码表 "+dbManager.getTable(DbSheetLabelScan.class).tableIsExist());
//                    Log.i(TAG, "onReceive:   扫码表的内容： "+dbManager.selector(DbSheetLabelScan.class).findAll());

//                    List<DbSheetScan> stocks = dbManager.findAll(DbSheetScan.class);
//                    DbSheetScan table = stocks.get(0);
//                    table.setGoodsAmount(table.getGoodsAmount()+1);



//                    dbManager.dropTable(DbSheetScan.class);
//                    dbManager.dropTable(DbSheetLabelScan.class);
//                        Log.i(TAG, "onReceive:   删除了");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    num_time = num++;
                initAdapter();
                myAdapter.notifyDataSetChanged();
                tv_time.setText(num_time+"/"+0);
                tv_saoma.setText(num_time+"/"+0);
            }
        };
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(InformationActivity.this,DailogActivity.class),6);
            }
        });
        //floatactionbutton的动画
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!fabopen){
                    openMenu(v);
                }else{
                    closeMenu(v);
                }
            }
        });

        //上传需要加密
        fab_shangchuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        
    }

    private void initGetIntentdata() {
        position = getIntent().getIntExtra("position",0);
        truckid = getIntent().getIntExtra("truckid",0);
        createdate = getIntent().getStringExtra("createdate");
        updatedate = getIntent().getStringExtra("updatedate");
        loadshiftid = getIntent().getIntExtra("id",0);
        Log.i(TAG, "initGetIntentdata:   "+loadshiftid);
        loadshopid =getIntent().getIntExtra("shopid",0);
//        List<BanCiBean.DataBean.RowsBean> rowslist = (List<BanCiBean.DataBean.RowsBean>) getIntent().getSerializableExtra("list");
        licensePlate = getIntent().getStringExtra("licensePlate");
        lineBranchId = getIntent().getIntExtra("lineBranchId",0);
        lineBranchName = getIntent().getStringExtra("lineBranchName");
        lineBranchNo = getIntent().getIntExtra("lineBranchNo",0);
        shopId = getIntent().getIntExtra("shopId",0);
        shopName = getIntent().getStringExtra("shopName");
        driverId = getIntent().getIntExtra("driverId",0);
        driverName = getIntent().getStringExtra("driverName");
        driverPhone = getIntent().getStringExtra("driverPhone");

    }

    //上传的操作
    private void initUpload() {
        dbSheetLabelScan = new DbSheetLabelScan();
        dbSheetLabelScan.setLabel(barcodeStr);
        dbSheetLabelScan.setTimestamp(getStringDate());
        dbSheetLabelScanList.add(dbSheetLabelScan);

        ScanInput scanInput = new ScanInput();
        scanInput.setTimestamp(getStringDate());
        scanInput.setAmount(0);
        scanInputList.add(scanInput);

        SheetScanRecordUpload upload = new SheetScanRecordUpload();
        upload.setScanInputList(scanInputList);
        upload.setDbSheetLabelScanList(dbSheetLabelScanList);
        upload.setSheetno(sheetno);
        Base64Support.encode(upload.toString().getBytes());

    }

    private void initTableExisit() {
        try {
            TableEntity<DbSheetScan> tableEntity = dbManager.getTable(DbSheetScan.class);
            Log.i(TAG, "initData: 表是否存在  "+tableEntity.tableIsExist());
            if(!tableEntity.tableIsExist()|| position!=position_id){
                SharedPreferencesUtils.sharedEditor(InformationActivity.this).putInt("id",position).commit();
                initData();
            }else{
//                Toast.makeText(this, "表有了", Toast.LENGTH_SHORT).show();
                int sheetamount = SharedPreferencesUtils.sharedGet(InformationActivity.this).getInt("sheetamount",0);
                int storeamount = SharedPreferencesUtils.sharedGet(InformationActivity.this).getInt("storeamount",0);
                int goodsamount = SharedPreferencesUtils.sharedGet(InformationActivity.this).getInt("goodsamount",0);
                tv_zong.setText(sheetamount+"/"+goodsamount);
                tv_kucun.setText(storeamount+"");
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    //初始化config
    private void initConfig() {
        DbManager.DaoConfig config = new DbManager.DaoConfig().setAllowTransaction(true)
                .setDbVersion(1)
                .setDbName("Stock")
                .setTableCreateListener(new DbManager.TableCreateListener() {
                    @Override
                    public void onTableCreated(DbManager db, TableEntity<?> table) {
                        Toast.makeText(InformationActivity.this, "创建表了", Toast.LENGTH_SHORT).show();
                    }
                })
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager db) {
//                        Toast.makeText(InformationActivity.this, "数据库被打开了", Toast.LENGTH_SHORT).show();
                        // 开启WAL, 对写入加速提升巨大
                        db.getDatabase().enableWriteAheadLogging();
                    }
                })
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
//                        Toast.makeText(InformationActivity.this, "数据库版本变化了", Toast.LENGTH_SHORT).show();
                    }
                });
        dbManager = x.getDb(config);
    }

    //数据库操作
    private void initTable(){
        try {
            List<DbSheetScan> stockList = dbManager.selector(DbSheetScan.class).where("sheetno", "=", str).findAll();
            SharedPreferencesUtils.sharedEditor(InformationActivity.this).putString("str",str).commit();
            String label = SharedPreferencesUtils.sharedGet(InformationActivity.this).getString("str",null);
            Log.i(TAG, "initTable:   label  "+label);
            if(stockList!=null&&stockList.size()>0){
                if(!label.equals(scanLabel)){
                    DbSheetScan dbSheetScan = stockList.get(0);
                    dbSheetScanId = dbSheetScan.getId();
                    fromname = dbSheetScan.getFromShopName();
                    proname = dbSheetScan.getGoodsName();
                    toname = dbSheetScan.getToShopName();
                    proamount = dbSheetScan.getGoodsAmount();
                    dbSheetScan.setSheetNo(Trackingno);
                    danHaos.add(dbSheetScan);
                    list.clear();
                }
            }else {
                //二次查询还没有的话就代表窜货了，如果二次返回有的话，服务器会返回一条数据，此时库存表就需要追加一条数据。
//                    Toast.makeText(this, "数据不存在，需要二次查询", Toast.LENGTH_SHORT).show();
                    Call<ResponseBody> query = retrofit.create(MyRetrofit.class).Query(loadshiftid,loadshopid,"0","2017-04-01 00:00:00","2017-04-18 00:00:00",Trackingno,"1.0.0");
                    query.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            try {
                                String callback = response.body().string();
                                Log.i(TAG, "onResponse:   二次查询返回的数据 " + callback);

                                /**
                                 * 返回的是一条数据，需要加到库存表里
                                 * */
//                        dbManager.save(new DbSheetScan());

                                /**
                                 * 如果返回的代表库存里没有，就代表窜货了
                                 * */
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        initScan();
        //广播注册
        IntentFilter filter = new IntentFilter();
        filter.addAction(SCAN_ACTION);
        registerReceiver(mScanReceiver,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(scanManager != null) {
            scanManager.stopDecode();
            isScaning = false;
        }
        if (scanManager != null && lockTrigglerState) {
            scanManager.lockTriggler();
        }

        if (scanManager != null && !scanPowerState) {
            scanManager.closeScanner();
        }
        unregisterReceiver(mScanReceiver);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 6&&resultCode==9){
            cb.setChecked(false);
        }
    }

    private void initProgressDialog() {
        pd = new ProgressDialog(InformationActivity.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage("加载中,请稍后...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);
        pd.show();
    }

    private void initData() {
        initProgressDialog();

        Call<ResponseBody> call = retrofit.create(MyRetrofit.class).Info_yundan(loadshiftid,loadshopid,"0","2017-04-01 00:00:00","2017-04-18 23:59:59","1.0.0");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    /**
                     * totalSheetAmount : 3   总票数
                     * totalStoreAmount : 10  库存
                     * totalGoodsAmount : 10   件数
                     * */
                    String str = response.body().string();
                    Entruck bean = new Gson().fromJson(str,Entruck.class);
                    Log.i(TAG, "onResponse:  "+bean);
                    totalSheetAmount = bean.getData().getTotalSheetAmount();
                    totalStoreAmount = bean.getData().getTotalStoreAmount();
                    totalGoodsAmount = bean.getData().getTotalGoodsAmount();

                    SharedPreferencesUtils.sharedEditor(InformationActivity.this).putInt("sheetamount",totalSheetAmount)
                            .putInt("storeamount",totalStoreAmount)
                            .putInt("goodsamount",totalGoodsAmount).commit();

                    tv_zong.setText(totalSheetAmount+"/"+totalGoodsAmount);
                    tv_kucun.setText(totalStoreAmount+"");
                    rowslist = bean.getData().getRows();
                    Log.i(TAG, "onResponse: rowslist  "+rowslist.size());
                    pd.dismiss();
                    for (int i = 0; i < rowslist.size(); i++) {
                        formshopname = rowslist.get(i).getFromShopName();
                        goodsname = rowslist.get(i).getGoodsName();
                        goodsamount = rowslist.get(i).getGoodsAmount();
                        id = rowslist.get(i).getId();
                        sheetno = rowslist.get(i).getSheetNo();
                        sheetnoshort = rowslist.get(i).getSheetNoShort();
                        storeamount = rowslist.get(i).getStoreAmount();
                        toshopname = rowslist.get(i).getToShopName();
                        sheetNoConsign = rowslist.get(i).getSheetNoConsign();
                        dbSheetScan = new DbSheetScan(updatedate,createdate,Type.SCAN_TYPE_SEND,truckid,storeamount,sheetnoshort,toshopname,sheetno,sheetNoConsign,id,goodsname, goodsamount,formshopname);
//                        dbManager.save(dbSheetScan);
                        dbManager.saveBindingId(dbSheetScan);
//                        dbManager.save(new DbSheetScan(updatedate,createdate,Type.SCAN_TYPE_SEND,truckid,storeamount,sheetnoshort,toshopname,sheetno,sheetNoConsign,id,goodsname,goodsamount,formshopname));
                    }
                    List<DbSheetScan> list = dbManager.selector(DbSheetScan.class).findAll();
                    Log.i(TAG, "onResponse:  db  "+list.size()+"   "+list.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });

    }
    private void initAdapter() {
        myAdapter = new MyAdapter();
        lv.setAdapter(myAdapter);

    }

    //适配器显示
    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return danHaos.size();
        }

        @Override
        public Object getItem(int position) {
            return danHaos.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           ViewHolder holder;
            if(convertView == null){
                convertView = LayoutInflater.from(InformationActivity.this).inflate(R.layout.danhao,parent,false);
                holder = new ViewHolder();
                holder.tv_jianshu = (TextView) convertView.findViewById(R.id.tv_amount);
                holder.tv_danhao = (TextView) convertView.findViewById(R.id.tv_yundan);
                holder.tv_line = (TextView) convertView.findViewById(R.id.tv_line);
                holder.tv_name = (TextView) convertView.findViewById(R.id.tv_productname);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder) convertView.getTag();
            }
            //运单信息
            holder.tv_danhao.setText("No."+danHaos.get(position).getSheetNo()+"-"+list.size()+"/"+danHaos.get(position).getGoodsAmount());
            holder.tv_name.setText(danHaos.get(position).getGoodsName());
            holder.tv_jianshu.setText(String.valueOf(danHaos.get(position).getGoodsAmount()));
            holder.tv_line.setText(danHaos.get(position).getFromShopName()+"-"+danHaos.get(position).getToShopName());
            return convertView;
        }
        class ViewHolder{
            TextView tv_danhao,tv_line,tv_jianshu,tv_name;
        }
    }

    private void initView() {
        tv_zong = (TextView) findViewById(R.id.zong_piao);
        tv_kucun = (TextView) findViewById(R.id.kucun);
        tv_time = (TextView) findViewById(R.id.time_piao);
        tv_saoma = (TextView) findViewById(R.id.saoma);
        cb = (CheckBox) findViewById(R.id.cb);
        tv = (TextView)findViewById(R.id.tv_qiangzhi);
        actionButton = (FloatingActionButton) findViewById(R.id.fab_info);
        fab_kuncun = (TextView) findViewById(R.id.shangchuan_tv);
        fab_shangchuan = (TextView) findViewById(R.id.kucun_tv);
        lv = (ListView) findViewById(R.id.info_lv);
    }
    private void initScan() {
        scanManager = new ScanManager();
        scanPowerState = scanManager.getScannerState();
        if(!scanPowerState){
            scanManager.openScanner();
        }
        //获得扫描按键的锁定状态，true为锁定，false为非锁定
        lockTrigglerState = scanManager.getTriggerLockState();
        if(lockTrigglerState){
            scanManager.unlockTriggler();
        }
    }
    public void openMenu(View v){
        ObjectAnimator animator = ObjectAnimator.ofFloat(v,"rotation",0,-45);
        animator.setDuration(300);
        animator.start();
        fab_shangchuan.setVisibility(View.VISIBLE);
        fab_kuncun.setVisibility(View.VISIBLE);
        fabopen = true;
    }
    public void closeMenu(View v){
        ObjectAnimator animator = ObjectAnimator.ofFloat(v,"rotation",-45,0);
        animator.setDuration(300);
        animator.start();
        fab_shangchuan.setVisibility(View.GONE);
        fab_kuncun.setVisibility(View.GONE);
        fabopen = false;
    }
    public OkHttpClient httpClient(){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Accept","application/json; charset=utf-8")
                                .addHeader("Authorization",getAuthorization())
                                .build();
                        return chain.proceed(request);
                    }
                }).build();
        return client;
    }
    public String getAuthorization(){
        String ses = SharedPreferencesUtils.sharedGet(InformationActivity.this).getString("sessionKey","");
        String com = SharedPreferencesUtils.sharedGet(InformationActivity.this).getString("companyNo","");
        String token = Base64Support.encode((com+":"+ses).getBytes());
        String headerAuthorization = "Basic " + token;
        return headerAuthorization;
    }
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
