package com.example.administrator.myapplication.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Utils.LoadingAnimotion;

import org.greenrobot.eventbus.EventBus;


public class HomeActivity extends AppCompatActivity {
    private ImageView iv,iv2;
    private long time =0;
    private Toolbar toolbar;
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_homepage);


        initView();
        initToolbar();



        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }
        });


    }

    private void initToolbar() {
        toolbar.setNavigationIcon(R.mipmap.push);
        toolbar.setSubtitle("我的物流云");
    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv);
        toolbar = (Toolbar) findViewById(R.id.home_tb);

    }

    @Override
    public void onBackPressed() {
        long current = System.currentTimeMillis();
        if(current - time <1000){
            finish();
        }else{
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
        }
        time = current;
    }

}
