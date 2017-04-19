package com.example.administrator.myapplication.Activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.device.ScanManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;

import java.util.ArrayList;
import java.util.List;

public class YunDanActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView tv;
    private ImageView iv_delete,iv_search;
    private EditText et_showresult,et_yundanhao;
    private ScanManager scanManager;
    private String barcodeStr;
    private boolean scanPowerState;
    private boolean lockTrigglerState;
    private boolean isScaning = false;
    private BroadcastReceiver mScanReceiver;
    private final static String SCAN_ACTION = "urovo.rcv.message";
    private List<String> danhaolist = new ArrayList<>();
    private ListView lv;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_saoma);

        initView();

        initScan();


        mScanReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                isScaning = false;
                byte[] barocode = intent.getByteArrayExtra("barocode");
                int barocodelen = intent.getIntExtra("length", 0);
                byte temp = intent.getByteExtra("barcodeType", (byte) 0);
                android.util.Log.i("debug", "----codetype--" + temp);
                barcodeStr = new String(barocode, 0, barocodelen);
                danhaolist.add(barcodeStr);
                initAdapter();
                myAdapter.notifyDataSetChanged();
            }
        };


        String orgname = SharedPreferencesUtils.sharedGet(YunDanActivity.this).getString("orgname","");
        toolbar.setNavigationIcon(R.mipmap.back);
        //标题显示是发货网点
        tv.setText(orgname);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        //查询
        iv_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(YunDanActivity.this, "点击查询了", Toast.LENGTH_SHORT).show();
            }
        });
        //清空输入框
        iv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_yundanhao.setText("");
            }
        });


    }

    private void initAdapter() {
        myAdapter = new MyAdapter();
        lv.setAdapter(myAdapter);

    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return danhaolist.size();
        }

        @Override
        public Object getItem(int position) {
            return danhaolist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = LayoutInflater.from(YunDanActivity.this).inflate(R.layout.danhao,parent,false);
                holder = new ViewHolder();
//                holder.tv = (TextView) convertView.findViewById(R.id.lv_ceshi_tv);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder) convertView.getTag();
            }

            holder.tv.setText("运单号:"+danhaolist.get(position));
            return convertView;
        }

        class ViewHolder{
            TextView tv;
        }
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

    private void initView() {
        tv = (TextView) findViewById(R.id.tv_yundanwangdian);
        toolbar = (Toolbar) findViewById(R.id.tb_saoma);
        iv_delete = (ImageView) findViewById(R.id.iv_delete);
        iv_search = (ImageView) findViewById(R.id.iv_search);
//        et_showresult = (EditText) findViewById(R.id.et_showresult);
        et_yundanhao = (EditText) findViewById(R.id.et_yundanhao);
        lv = (ListView) findViewById(R.id.lv_saoma);
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
}
