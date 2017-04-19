package com.example.administrator.myapplication.Activity;

import android.app.Application;

import org.xutils.x;

/**
 * Created by zmy1 on 2017/4/13.
 */

public class MycloudApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
