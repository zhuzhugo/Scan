package com.example.administrator.myapplication.Utils;



import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zmy1 on 2017/4/1.
 */

public class RetrofitUtils {


    private static RetrofitUtils mRetrofitManager;
    private Retrofit mRetrofit;

    private RetrofitUtils(String url){
        initRetrofit(url);
    }

    public static synchronized RetrofitUtils getInstance(String url){
//        if (mRetrofitManager == null){
            mRetrofitManager = new RetrofitUtils(url);
//        }
        return mRetrofitManager;
    }


    private void initRetrofit(String url) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
    }

    public <T> T createClass(Class<T> reqServer){
        return mRetrofit.create(reqServer);
    }

}
