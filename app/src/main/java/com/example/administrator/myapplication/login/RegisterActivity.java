package com.example.administrator.myapplication.login;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

import okhttp3.OkHttpClient;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et_name,et_pass,et_twiceinput;
    private Button bt_register,bt_back;
    private SQLiteDatabase database;
    private MyOpenHelper myOpenHelper;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);

        initView();

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    et_twiceinput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    et_twiceinput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }

    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name_register_http);
        et_pass = (EditText) findViewById(R.id.et_pass_register_http);
        et_twiceinput = (EditText) findViewById(R.id.et_twice_input_http);
        bt_back = (Button) findViewById(R.id.bt_back_http);
        bt_register = (Button) findViewById(R.id.bt_register_http);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        bt_back.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_register_http:
                createDatabase();
//                createTable();
                insertTable();
                break;
            case R.id.bt_back_http:
                startActivity(new Intent(this,LoginActivity.class));
                finish();
                break;
        }
    }

    public void insertTable() {
        if(TwiceInput()) {
            createDatabase();
            String insertsql = "insert into name_table(name,pass) values('" + et_name.getText().toString() + "','" + et_pass.getText().toString() + "');";
            database.execSQL(insertsql);
            Toast.makeText(this, "注册成功，请按返回键重新登陆", Toast.LENGTH_SHORT).show();
        }
    }

    public void createDatabase() {
        myOpenHelper = new MyOpenHelper(this,"Login.db",null,1);
        database = myOpenHelper.getReadableDatabase();
    }

    public boolean TwiceInput(){
        if(et_pass.getText().toString().equals(et_twiceinput.getText().toString())){
            return true;
        }
            Toast.makeText(this, "两次输入的不一致，请重新输入", Toast.LENGTH_SHORT).show();
            return false;
    }
}
