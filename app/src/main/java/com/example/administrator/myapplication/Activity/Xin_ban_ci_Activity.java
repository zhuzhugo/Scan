package com.example.administrator.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.myapplication.Bean.ApiLoadShiftBean;
import com.example.administrator.myapplication.Bean.CreateNewBean;
import com.example.administrator.myapplication.Interface.MyRetrofit;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Support.Base64Support;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Xin_ban_ci_Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_xianlu;
    private EditText et_wangdian;
    private EditText et_chepai;
    private Button but_create;
    private EditText et_siji;
    private String xianlu,siji,chepai,wangdian;
    private Toolbar toolbar;
    private String str = null;
    private static final String TAG = "zzz";
    private ApiLoadShiftBean apiLoadShiftBean = new ApiLoadShiftBean();
    private ApiLoadShiftBean.ApiLoadShift apiLoadShift = apiLoadShiftBean.new ApiLoadShift();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_xin_ban_ci_);
        initView();
        toolbar = (Toolbar) findViewById(R.id.tb_new);
        toolbar.setNavigationIcon(R.mipmap.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(4);
                onBackPressed();
            }
        });

        String wangdian = SharedPreferencesUtils.sharedGet(Xin_ban_ci_Activity.this).getString("orgname","");
        et_wangdian.setText(wangdian);
    }

    private void initView() {
        et_xianlu = (EditText) findViewById(R.id.et_xianlu);
        et_wangdian = (EditText) findViewById(R.id.et_wangdian);
        et_chepai = (EditText) findViewById(R.id.et_chepai);
        but_create = (Button) findViewById(R.id.but_create);
        et_siji = (EditText) findViewById(R.id.et_siji);

        but_create.setOnClickListener(this);
        et_chepai.setOnClickListener(this);
        et_siji.setOnClickListener(this);
        et_xianlu.setOnClickListener(this);
        et_wangdian.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_create:
                if(submit()) {
                    Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.6.114:8480/T6/api/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(httpClient())
                            .build();
//                        String apiloadshitjson = new Gson().toJson(apiLoadShift);
//                    RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),apiloadshitjson);
                    Call<ResponseBody> call = retrofit.create(MyRetrofit.class).Create(apiLoadShift.getLineBranchId(),apiLoadShift.getLineBranchNo(),apiLoadShift.getLineBranchName(),apiLoadShift.getShopId(),apiLoadShift.getShopName(),
                            apiLoadShift.getTruckId(),apiLoadShift.getLicensePlate(),apiLoadShift.getDriverId(),apiLoadShift.getDriverName(),apiLoadShift.getDriverPhone(),"1.0.0");
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            try {
                                String json = response.body().string();
                                Log.i(TAG, "onResponse:  create "+json);
                                CreateNewBean createNewBean = new Gson().fromJson(json,CreateNewBean.class);
                                String mes = createNewBean.getMessage();
                                if(mes.equals("成功")){
                                    setResult(4);
                                    Xin_ban_ci_Activity.this.finish();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            Log.i(TAG, "onFailure: create failure"+t.toString());
                        }
                    });
//                    Xin_ban_ci_Activity.this.finish();
                }
                break;
            case R.id.et_xianlu:
                Intent intent_xianlu = new Intent(Xin_ban_ci_Activity.this,QueryActivity.class);
                intent_xianlu.putExtra("flag",1 );
                startActivityForResult(intent_xianlu,10);
                break;
            case R.id.et_wangdian:
//                Intent intent_wangdian = new Intent(Xin_ban_ci_Activity.this,QueryActivity.class);
//                intent_wangdian.putExtra("flag",2 );
//                startActivityForResult(intent_wangdian,11);
                break;
            case R.id.et_chepai:
                Intent intent_chepai = new Intent(Xin_ban_ci_Activity.this,QueryActivity.class);
                intent_chepai.putExtra("flag",3 );
                startActivityForResult(intent_chepai,12);
                break;
            case R.id.et_siji:
                Intent intent_driver = new Intent(Xin_ban_ci_Activity.this,QueryActivity.class);
                intent_driver.putExtra("flag",4 );
                startActivityForResult(intent_driver,13);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==0){
            str = data.getStringExtra("info");
            Log.i(TAG, "onActivityResult:   resultcode == 0 "+str);
            if(str!=null){
                switch (requestCode){
                    case 10:
                        et_xianlu.setText(str);
                        int lineBranchId = data.getIntExtra("lineBranchId",0);
                        int lineBranchNo = data.getIntExtra("lineBranchNo",0);
                        String lineBranchName = data.getStringExtra("lineBranchName");
                        int shopid = data.getIntExtra("shopid",0);
                        String shopname = data.getStringExtra("shopname");
                        apiLoadShift.setLineBranchId(lineBranchId);
                        apiLoadShift.setLineBranchName(lineBranchName);
                        apiLoadShift.setShopId(shopid);
                        apiLoadShift.setShopName(shopname);
                        apiLoadShift.setLineBranchNo(lineBranchNo);
                        Log.i(TAG, "onActivityResult:    api_lineBranchNo "+apiLoadShift.getLineBranchNo());
                        Log.i(TAG, "onActivityResult: api_lineBranchId "+apiLoadShift.getLineBranchId());
                        Log.i(TAG, "onActivityResult:  api_shopid "+apiLoadShift.getShopId());
                        break;
                    case 11:
//                        et_wangdian.setText(str);
                        break;
                    case 12:
                        et_chepai.setText(str);
                        int truckid = data.getIntExtra("truckid",0);
                        String licensePlate = data.getStringExtra("licensePlate");
                        apiLoadShift.setTruckId(truckid);
                        apiLoadShift.setLicensePlate(licensePlate);
                        break;
                    case 13:
                        et_siji.setText(str);
                        int driverid = data.getIntExtra("driverid",0);
                        String drivername = data.getStringExtra("drivername");
                        String driverphone = data.getStringExtra("driverphone");
                        apiLoadShift.setDriverId(driverid);
                        apiLoadShift.setDriverName(drivername);
                        apiLoadShift.setDriverPhone(driverphone);
                        break;
                }
                apiLoadShiftBean.setApiLoadShift(apiLoadShift);
            }
        } else if(resultCode == 00){
        }
    }

    private boolean submit() {
            xianlu = et_xianlu.getText().toString().trim();
        if (TextUtils.isEmpty(xianlu)) {
            Toast.makeText(this, "线路不能为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        wangdian = et_wangdian.getText().toString().trim();
        if (TextUtils.isEmpty(wangdian)) {
            Toast.makeText(this, "网点不能为空", Toast.LENGTH_SHORT).show();
            return false;
        }

         chepai = et_chepai.getText().toString().trim();
        if (TextUtils.isEmpty(chepai)) {
            Toast.makeText(this, "车牌不能为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        siji = et_siji.getText().toString().trim();
        if (TextUtils.isEmpty(siji)) {
            Toast.makeText(this, "司机不能为空", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
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
        String ses = SharedPreferencesUtils.sharedGet(Xin_ban_ci_Activity.this).getString("sessionKey","");
        String com = SharedPreferencesUtils.sharedGet(Xin_ban_ci_Activity.this).getString("companyNo","");
        Log.i(TAG, "getAuthorization:  getAuthorization——query "+  com+"     "+ses);
        String token = Base64Support.encode((com+":"+ses).getBytes());
        String headerAuthorization = "Basic " + token;
        return headerAuthorization;
    }

    @Override
    public void onBackPressed() {
        setResult(4);
        super.onBackPressed();
    }
}
