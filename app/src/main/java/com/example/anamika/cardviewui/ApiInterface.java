package com.example.anamika.cardviewui;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("DeviceAlarmEnableDisable")
    Call<ModelVibDuration> getVibDurationInfo(@Query("imei") String imei);
}
