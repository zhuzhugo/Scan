package com.example.administrator.myapplication.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class DailogActivity extends AppCompatActivity {
    private View layout;
    private Button button_queren,button_quxiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dailog);

        initView();

        button_quxiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DailogActivity.this.setResult(9);
                DailogActivity.this.finish();
            }
        });

        button_queren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DailogActivity.this, "点击确认了", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        button_queren = (Button) findViewById(R.id.button_queren);
        button_quxiao = (Button) findViewById(R.id.button_quxiao);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
