package com.example.administrator.myapplication.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.loginHttp.LoginHttpActivity;


public class WelcomeActivity extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomeActivity.this, LoginHttpActivity.class));
                WelcomeActivity.this.finish();
            }
        },2000);
    }
}
