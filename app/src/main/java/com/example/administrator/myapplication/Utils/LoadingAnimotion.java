package com.example.administrator.myapplication.Utils;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

/**
 * Created by zmy1 on 2017/4/5.
 */

public class LoadingAnimotion {
    public static Dialog createLoadingDialog(Context context, String msg) {

        View v = LayoutInflater.from(context).inflate(R.layout.loading_dialog, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        // main.xml中的ImageView
        ImageView spaceshipImage = (ImageView) v.findViewById(R.id.iv_loading);
        TextView tipTextView = (TextView) v.findViewById(R.id.tv_loading);// 提示文字
        // 加载动画
        Animation animation = AnimationUtils.loadAnimation(
                context, R.anim.loadinganim);
        // 使用ImageView显示动画
        spaceshipImage.startAnimation(animation);
        tipTextView.setText(msg);// 设置加载信息

        Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);// 创建自定义样式dialog

        loadingDialog.setCancelable(false);// 不可以用“返回键”取消
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局
        return loadingDialog;

    }
}
