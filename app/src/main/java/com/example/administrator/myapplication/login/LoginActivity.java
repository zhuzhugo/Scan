package com.example.administrator.myapplication.login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.myapplication.Activity.HomeActivity;
import com.example.administrator.myapplication.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et_name,et_pass;
    private Button bt_login,bt_register;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase database;
    private String name;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_log_in);

        initView();
        initTable();
    }

    private void initTable() {
        myOpenHelper = new MyOpenHelper(this,"Login.db",null,1);
        database = myOpenHelper.getReadableDatabase();
        database.execSQL("create table if not exists name_table(name varchar,pass varchar)");
    }


    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        bt_login = (Button) findViewById(R.id.button_login);
        bt_register = (Button) findViewById(R.id.button_register);

        bt_login.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_register:
                startActivity(new Intent(this,RegisterActivity.class));
//                finish();
                break;
            case R.id.button_login:
                if(idcorrect()){
                    startActivity(new Intent(this,HomeActivity.class));
                    finish();
                }
                break;
        }
    }


    public boolean idcorrect(){
        myOpenHelper = new MyOpenHelper(this,"Login.db",null,1);
        database = myOpenHelper.getReadableDatabase();
        Cursor cursor = database.rawQuery("select * from name_table",null);
        while(cursor.moveToNext()){
            name = cursor.getString(cursor.getColumnIndex("name"));
            pass = cursor.getString(cursor.getColumnIndex("pass"));
            if(name.equals(et_name.getText().toString())&& pass.equals(et_pass.getText().toString())){
                return true;
            }
        }
        Toast.makeText(this, "密码或账号输入错误，请重新输入", Toast.LENGTH_SHORT).show();
        return false;
    }


}
