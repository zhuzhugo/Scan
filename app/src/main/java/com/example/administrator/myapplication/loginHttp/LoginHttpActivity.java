package com.example.administrator.myapplication.loginHttp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.myapplication.Activity.HomeActivity;
import com.example.administrator.myapplication.Bean.LoginBean;
import com.example.administrator.myapplication.Interface.MyRetrofit;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Utils.RetrofitUtils;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginHttpActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText loginname,loginpass;
    private Button but_log,but_register;
    private OkHttpClient okHttpClient;
    private static final String TAG = "zzz";
    private ProgressDialog pd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        okHttpClient = new OkHttpClient();
        initView();
        but_log.setOnClickListener(this);

    }

    private void initProgressDialog() {
        pd = new ProgressDialog(LoginHttpActivity.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);//设置圆形的进度条风格
        pd.setMessage("登录中,请稍后...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);//设置是否可以按返回键取消
        pd.show();
    }

    private void initView() {
        loginname = (EditText) findViewById(R.id.et_username);
        loginpass = (EditText) findViewById(R.id.et_password);
        but_log = (Button) findViewById(R.id.button_http_login);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_http_login:
                initProgressDialog();

                dologin();
                break;
        }
    }

    private void dologin() {
        //http://portal.my56cloud.com/
        //http://192.168.6.114:8180/
        RetrofitUtils.getInstance("http://192.168.6.114:8180/").createClass(MyRetrofit.class)
                .login(loginname.getText().toString(),loginpass.getText().toString(),"T6","1","28","117.337169","1","1","1","1")
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String object = response.body().string();
                            Log.i(TAG, "onResponse:   "+object);
                            LoginBean bean = new Gson().fromJson(object,LoginBean.class);
                            boolean flag = bean.isSuccess();
                            LoginBean.DataBean apiUser = bean.getData();

                            SharedPreferencesUtils.sharedEditor(LoginHttpActivity.this)
                                    .putString("sessionKey",apiUser.getSessionKey())
                                    .putString("companyNo",apiUser.getCompanyNo())
                                    .putString("orgname",apiUser.getAttributes().getOrgName())
                                    .commit();

                            if(flag){
                                pd.dismiss();
                                Toast.makeText(LoginHttpActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginHttpActivity.this, HomeActivity.class));
                                finish();
                            }else{
                                Toast.makeText(LoginHttpActivity.this, "用户名或密码错误，请重新输入", Toast.LENGTH_SHORT).show();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.i(TAG, "onResponse: Exception "+e.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        pd.dismiss();
                        Toast.makeText(LoginHttpActivity.this, "登录失败,请重新登录", Toast.LENGTH_LONG).show();
                        Log.i(TAG, "onFailure:  "+t);
                    }
                });
    }



}
