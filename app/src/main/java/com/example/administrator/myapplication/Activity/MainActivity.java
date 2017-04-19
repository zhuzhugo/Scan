package com.example.administrator.myapplication.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.myapplication.Bean.BanCiBean;
import com.example.administrator.myapplication.Interface.MyRetrofit;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Support.Base64Support;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;
import com.google.gson.Gson;

import org.xutils.DbManager;

import java.io.IOException;
import java.util.ArrayList;
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

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<BanCiBean.DataBean.RowsBean> rowslist = new ArrayList<>();
    private BanCiBean.DataBean.RowsBean rowsBean;
    private MyAdapter myAdapter;
    private static final String TAG = "zzz";
    private Button but_create,but_new;
    private String str_chepai ,str_siji;
    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;
    private ProgressDialog pd;
    private int truckid;
    private String createdate;
    private String updateDate;
    private DbManager dbManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initView();
        initData();


        toolbar.setNavigationIcon(R.mipmap.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


//        listview的item点击事件（有冲突）是否是swipelayout与listview的冲突？
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "onItemClick:   "+position);
//                Toast.makeText(MainActivity.this, "点击了"+rowslist.get(position).getDriverName(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,YunDanActivity.class));
            }
        });


//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivityForResult(new Intent(MainActivity.this,Xin_ban_ci_Activity.class),8);
//            }
//        });
        but_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this,Xin_ban_ci_Activity.class),8);
            }
        });

    }

    private void initAdapter() {
        myAdapter = new MyAdapter();
        lv.setAdapter(myAdapter);
    }

    private void initProgressDialog() {
        pd = new ProgressDialog(MainActivity.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);//设置圆形的进度条风格
        pd.setMessage("加载中,请稍后...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);//设置是否可以按返回键取消
        pd.show();
    }
    //http://portal.my56cloud.com/
    private void initData() {
        initProgressDialog();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.6.114:8480/T6/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient())
                .build();
        Call<ResponseBody> call = retrofit.create(MyRetrofit.class).info_banci("2017-03-01 00:00:00","2017-05-01 00:00:00","0","1.0.0");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String data = response.body().string();
                    BanCiBean banCiBean = new Gson().fromJson(data,BanCiBean.class);
                    rowslist = banCiBean.getData().getRows();
                    Log.i(TAG, "onResponse:  initrows "+rowslist.size());
                    initAdapter();
                    pd.dismiss();
                    myAdapter.notifyDataSetChanged();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }



    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
        but_create = (Button) findViewById(R.id.but_create);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        but_new = (Button) findViewById(R.id.fab);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 8 && resultCode == 4){
            initData();
        }
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return rowslist.size();
        }

        @Override
        public Object getItem(int position) {
            return rowslist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.lv_layout,null);
                holder = new ViewHolder();
                holder.tv = (TextView) convertView.findViewById(R.id.put);
                holder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
                holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                holder.tv_banci = (TextView) convertView.findViewById(R.id.tv_banci);
                holder.tv_lineBranchName = (TextView) convertView.findViewById(R.id.tv_lineBranchName);
                holder.hidell = convertView.findViewById(R.id.hide_ll);
                convertView.setTag(holder);
            }else{
                holder= (ViewHolder) convertView.getTag();
            }

            //滑动出来的view的装车点击事件传班次的id和shopid
            holder.tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,InformationActivity.class);
                    intent.putExtra("id",rowslist.get(position).getId());
                    intent.putExtra("shopid",rowslist.get(position).getShopId());
                    intent.putExtra("truckid",rowslist.get(position).getTruckId());
                    intent.putExtra("createdate",rowslist.get(position).getCreateDate());
                    intent.putExtra("updatedate",rowslist.get(position).getUpdateDate());
                    intent.putExtra("licensePlate",rowslist.get(position).getLicensePlate());
                    intent.putExtra("lineBranchId",rowslist.get(position).getLineBranchId());
                    intent.putExtra("lineBranchName",rowslist.get(position).getLineBranchName());
                    intent.putExtra("lineBranchNo",rowslist.get(position).getLineBranchNo());
                    intent.putExtra("shopId",rowslist.get(position).getShopId());
                    intent.putExtra("shopName",rowslist.get(position).getShopName());
                    intent.putExtra("driverId",rowslist.get(position).getDriverId());
                    intent.putExtra("driverName",rowslist.get(position).getDriverName());
                    intent.putExtra("isSend",rowslist.get(position).getIsSend());
                    intent.putExtra("driverPhone",rowslist.get(position).getDriverPhone());
                    intent.putExtra("position",position);
//                    intent.putExtra("list", (Serializable) rowslist);
                    startActivity(intent);
                }
            });
            holder.tv_banci.setText(rowslist.get(position).getShiftNo());
            holder.tv_info.setText(rowslist.get(position).getLicensePlate()+"("+rowslist.get(position).getDriverName()+")");
            holder.tv_time.setText(rowslist.get(position).getCreateDate());
            holder.tv_lineBranchName.setText(rowslist.get(position).getLineBranchName());
            return convertView;
        }
    }
    class ViewHolder{
        View hidell;
        TextView tv,tv_info,tv_time,tv_banci,tv_lineBranchName;
    }


//    public static String getStringDate() {
//        Date currentTime = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateString = formatter.format(currentTime);
//        return dateString;
//    }

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
        String ses = SharedPreferencesUtils.sharedGet(MainActivity.this).getString("sessionKey","");
        String com = SharedPreferencesUtils.sharedGet(MainActivity.this).getString("companyNo","");
        Log.i(TAG, "getAuthorization:  getAuthorization "+  com+"     "+ses);
        String token = Base64Support.encode((com+":"+ses).getBytes());
        String headerAuthorization = "Basic " + token;
        return headerAuthorization;
    }
}
