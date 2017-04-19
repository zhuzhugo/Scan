package com.example.administrator.myapplication.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import static android.content.Context.MODE_PRIVATE;

/**
 * Created by zmy1 on 2017/4/5.
 */

public class SharedPreferencesUtils {
    public static  SharedPreferences.Editor sharedEditor (Context context){
        SharedPreferences pref = context.getSharedPreferences("data", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        return editor;
    }

    public static SharedPreferences sharedGet(Context context){
        SharedPreferences pref = context.getSharedPreferences("data",MODE_PRIVATE);
        return pref;
    }

}
