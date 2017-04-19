package com.example.administrator.myapplication.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.Bean.DriverBean;
import com.example.administrator.myapplication.Bean.LineBean;
import com.example.administrator.myapplication.Bean.PlateBean;
import com.example.administrator.myapplication.Interface.MyRetrofit;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.Support.Base64Support;
import com.example.administrator.myapplication.Utils.SharedPreferencesUtils;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class QueryActivity extends AppCompatActivity {
    private XRecyclerView xRecyclerView;
    private EditText et_input;
    private Lineadapter lineadapter;
    private Handler handler = new Handler();
    private static final String TAG = "zzz";
    private Toolbar toolbar;
    private List<LineBean.DataBean> linedatalist;
    private List<PlateBean.DataBean> platedatalist;
    private List<DriverBean.DataBean> driverdatalist;
    private ImageView imageView;
    private String baseUrl = "http://192.168.6.114:8480/T6/api/";
    private PlateAdapter plateAdapter;
    private DriverAdapter driverAdapter;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_query);

        initView();


        toolbar.setNavigationIcon(R.mipmap.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //下拉刷新
        xRecyclerView.setPullRefreshEnabled(true);
        //上拉加载
        xRecyclerView.setLoadingMoreEnabled(false);

        //xrv的监听事件（下拉刷新，上拉加载）
        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            //下拉刷新
            public void onRefresh() {
                //网络加载
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
////                        list.add(0,"新数据");
//                        myadapter.notifyDataSetChanged();
//                        //停止刷新
//                        xRecyclerView.refreshComplete();
//                    }
//                },2000);
            }

            @Override
            //上拉加载
            public void onLoadMore() {

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });


    }

    private void initLineAdapter() {
        xRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        lineadapter = new Lineadapter();
        xRecyclerView.setAdapter(lineadapter);
    }
    private void initPlateAdapter(){
        xRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        plateAdapter = new PlateAdapter();
        xRecyclerView.setAdapter(plateAdapter);
    }
    private void initDriverAdapter(){
        xRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        driverAdapter = new DriverAdapter();
        xRecyclerView.setAdapter(driverAdapter);
    }


    private void initProgressDialog() {
        pd = new ProgressDialog(QueryActivity.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);//设置圆形的进度条风格
        pd.setMessage("加载中,请稍后...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);//设置是否可以按返回键取消
        pd.show();
    }
    //获取数据(网络加载)
    private void initData() {
        initProgressDialog();
        int flag = getIntent().getIntExtra("flag",0);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient())
                .build();
        switch (flag){
            case 1://线路
                final Call<ResponseBody> line = retrofit.create(MyRetrofit.class).Line(et_input.getText().toString(),"1.0.0");
                line.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String linejson = response.body().string();
                            Log.i(TAG, "onResponse:   query  "+linejson);
                            LineBean lineBean = new Gson().fromJson(linejson,LineBean.class);
                            linedatalist = lineBean.getData();
                            initLineAdapter();
                            pd.dismiss();
                            lineadapter.notifyDataSetChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.i(TAG, "onFailure:   query "+t);
                    }
                });
                break;
            case 2://网点
                break;
            case 3://车牌
                Call<ResponseBody> Plate = retrofit.create(MyRetrofit.class).Plate(et_input.getText().toString(),"1.0.0");
                Plate.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String Platejson = response.body().string();
                            Log.i(TAG, "onResponse:  platejson "+Platejson);
                            PlateBean plateBean = new Gson().fromJson(Platejson,PlateBean.class);
                            platedatalist = plateBean.getData();
                            initPlateAdapter();
                            pd.dismiss();
                            plateAdapter.notifyDataSetChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
                break;
            case 4://司机
                Call<ResponseBody> Driver = retrofit.create(MyRetrofit.class).Driver(et_input.getText().toString(),"司机","1.0.0");
                Driver.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String driverjson = response.body().string();
                            Log.i(TAG, "onResponse:   driverjson "+driverjson);
                            DriverBean driverBean = new Gson().fromJson(driverjson,DriverBean.class);
                            driverdatalist = driverBean.getData();
                            initDriverAdapter();
                            pd.dismiss();
                            driverAdapter.notifyDataSetChanged();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
                break;
        }
    }

    private void initView() {
        xRecyclerView = (XRecyclerView) findViewById(R.id.xrecyclerview);
        et_input = (EditText) findViewById(R.id.et_query);
        toolbar = (Toolbar) findViewById(R.id.query_toolbar);
        imageView = (ImageView) findViewById(R.id.iv_search);
    }

    //线路的显示
    class Lineadapter extends RecyclerView.Adapter<Lineadapter.MyHolder>{
        @Override
        public Lineadapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(QueryActivity.this).inflate(R.layout.xrv_item,parent,false));
        }

        @Override
        public void onBindViewHolder(final Lineadapter.MyHolder holder, final int position) {
            holder.tv.setText("["+ linedatalist.get(position).getTypeDesc()+"]"+ linedatalist.get(position).getName());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("info", linedatalist.get(position).getName());
                    intent.putExtra("lineBranchId",linedatalist.get(position).getId());
                    intent.putExtra("lineBranchNo",linedatalist.get(position).getNo());
                    intent.putExtra("shopid",linedatalist.get(position).getFromShopId());
                    intent.putExtra("shopname",linedatalist.get(position).getFromShopName());
                    setResult(0,intent);
                    QueryActivity.this.finish();
                }
            });
        }

        @Override
        public int getItemCount() {
            return linedatalist.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

            public TextView tv;
            public MyHolder(View itemView) {
                super(itemView);
                this.tv = (TextView) itemView.findViewById(R.id.xrv_tv);
            }
        }
    }
    //车牌的显示
    class PlateAdapter extends RecyclerView.Adapter<PlateAdapter.MyHolder> {

        @Override
        public PlateAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(QueryActivity.this).inflate(R.layout.xrv_item,parent,false));
        }

        @Override
        public void onBindViewHolder(PlateAdapter.MyHolder holder, final int position) {
            holder.tv.setText(platedatalist.get(position).getLicensePlate());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("info",platedatalist.get(position).getLicensePlate());
                    intent.putExtra("truckid",platedatalist.get(position).getId());
                    intent.putExtra("licensePlate",platedatalist.get(position).getLicensePlate());
                    setResult(0,intent);
                    QueryActivity.this.finish();
                }
            });
        }

        @Override
        public int getItemCount() {
            return platedatalist.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

            public TextView tv;
            public MyHolder(View itemView) {
                super(itemView);
                this.tv = (TextView) itemView.findViewById(R.id.xrv_tv);
            }
        }
    }
    //司机的显示
    class DriverAdapter extends RecyclerView.Adapter<DriverAdapter.MyHolder>{

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(QueryActivity.this).inflate(R.layout.xrv_item,parent,false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {
            if(driverdatalist.size()>0){
                holder.tv.setText(driverdatalist.get(position).getName());
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.putExtra("info",driverdatalist.get(position).getName());
                        intent.putExtra("driverid",driverdatalist.get(position).getId());
                        intent.putExtra("drivername",driverdatalist.get(position).getName());
                        intent.putExtra("driverphone",driverdatalist.get(position).getPhone());
                        setResult(0,intent);
                        QueryActivity.this.finish();
                    }
                });
            }else{
                Toast.makeText(QueryActivity.this, "无数据", Toast.LENGTH_SHORT).show();
            }


        }

        @Override
        public int getItemCount() {
            return driverdatalist.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

            public TextView tv;
            public MyHolder(View itemView) {
                super(itemView);
                this.tv = (TextView) itemView.findViewById(R.id.xrv_tv);
            }
        }
    }

    public OkHttpClient httpClient(){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Accept","application/json; charset=utf-8")
                                .addHeader("Authorization",getAuthorization())
                                .build();
                        return chain.proceed(request);
                    }
                }).build();
        return client;
    }

    public String getAuthorization(){
        String ses = SharedPreferencesUtils.sharedGet(QueryActivity.this).getString("sessionKey","");
        String com = SharedPreferencesUtils.sharedGet(QueryActivity.this).getString("companyNo","");
        Log.i(TAG, "getAuthorization:  getAuthorization——query "+  com+"     "+ses);
        String token = Base64Support.encode((com+":"+ses).getBytes());
        String headerAuthorization = "Basic " + token;
        return headerAuthorization;
    }

    @Override
    public void onBackPressed() {
        setResult(00,new Intent().putExtra("str",false));
        super.onBackPressed();
    }
}
