package com.example.ui.api;

import com.example.ui.model.Data;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    @GET("homepage/")
    @Headers({
            "device_id: phuchoa3t",
            "device: device name",
            "version: 1.18.0",
            "platform: android",
            "ignore: true"
    })
    Observable<Data> getHomepageData();
}
