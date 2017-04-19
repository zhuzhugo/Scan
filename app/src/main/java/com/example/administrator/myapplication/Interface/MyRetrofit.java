package com.example.administrator.myapplication.Interface;

import com.example.administrator.myapplication.Bean.ApiLoadShiftBean;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/3/27.
 */

//http://192.168.7.13/api/auth/v1/ltl/loadShift/find?beginTime=&endTime&privateFlag
    //http://192.168.7.13:8180/T6/api/auth/v1/ltl/loadShift/create
public interface MyRetrofit {


//    @GET("?tn=62095104_oem_dg")
    //portal/api/anon/v1/auth/login
    @GET("portal/api/anon/v1/auth/login")
    Call<ResponseBody> login(@Query("loginName") String loginName, @Query("password") String password,@Query("appKey") String appkey,@Query("deviceCode") String deviceCode,@Query("appVer")
            String appVer,@Query("longitude") String longitude,@Query("latidute")String latidute,@Query("location") String location,@Query("HttpServletReuest") String request,@Query("HttpServletResponse")String response);

    @GET("auth/v1/ltl/loadShift/find")
    Call<ResponseBody> info_banci(@Query("beginTime") String beginTime,@Query("endTime") String endTime,@Query("privateFlag") String privateFlag,@Query("av") String av);

    @GET("auth/v1/ltl/lineBranch/find")
    Call<ResponseBody> Line(@Query("keyword")String keyword,@Query("av") String av);

    @GET("auth/v1/ltl/truck/find")
    Call<ResponseBody> Plate(@Query("keyword")String keyword,@Query("av")String av);

    @GET("auth/v1/sys/user/findAllByKeyword")
    Call<ResponseBody> Driver(@Query("keyword")String keyword,@Query("userType")String userType,@Query("av")String av);

//    @POST("auth/v1/ltl/loadShift/create")
//    Call<ResponseBody> Create(@Body ApiLoadShiftBean loadShiftBean, @Query("av")String av);

    @POST("auth/v1/ltl/loadShift/create")
    Call<ResponseBody> Create(@Query("lineBranchId")int lineBranchId,@Query("lineBranchNo")int lineBranchNo,@Query("lineBranchName")String lineBranchName,@Query("shopId")int shopId,@Query("shopName")String shopName,@Query("truckId")int truckId,@Query("licensePlate")String licensePlate,@Query("driverId")int driverId,@Query("driverName")String driverName,@Query("driverPhone")String driverPhone,@Query("av")String av);

    @GET("auth/v1/ltl/loadShiftSheet/findLoadingSheet")
    Call<ResponseBody> Info_yundan(@Query("loadShiftId")int loadShiftId,@Query("loadShopId")int loadShopId,@Query("nextShopId")String nextShopId,@Query("beginTime")String beginTime,@Query("endTime")String endTime,@Query("av")String av);

    //上传
    /**
     * String batchNo, Long loadShiftId, Long sendShopId, Long arriveShopId, String text, String driverName, String licensePlate, Integer isSend
     * */
    @POST("auth/v1/ltl/sheetScanRecord/send")
    Call<ResponseBody> Send(@Query("batchNo")String batchNo,@Query("loadShiftId")long loadShiftId,@Query("sendShopId")long sendShopId,@Query("arriveShopId")long arriveShopId,@Query("text")String text,@Query("driverName")String driverName,@Query("licensePlate")String licensePlate,@Query("isSend")Integer isSend,@Query("av")String av);

    //二次查询
    @GET("auth/v1/ltl/loadShiftSheet/getLoadingSheet")
    Call<ResponseBody> Query(@Query("loadShiftId")int loadShiftId,@Query("loadShopId")int loadShopId,@Query("nextShopId")String nextShopId,@Query("beginTime")String beginTime,@Query("endTime")String endTime,@Query("sheetNoShort")String sheetNo,@Query("av")String av);

}
