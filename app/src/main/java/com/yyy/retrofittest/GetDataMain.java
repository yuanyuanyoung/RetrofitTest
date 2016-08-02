package com.yyy.retrofittest;

import java.util.Map;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by admin on 2016/8/1.
 */

public interface GetDataMain {
    @GET("?")
    Call<LoginData> getUserMsg(@Query("contactPhone") String contactPhone, @Query("password") String password);

    @POST ("?")
    Call<LoginData> getWhitMap(@QueryMap Map<String, String> options);

    @GET("?")
    Observable<LoginData> getIpInfo(@Query("contactPhone") String contactPhone, @Query("password") String password);
}
