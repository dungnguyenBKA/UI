package com.example.ui.api;

import com.example.ui.model.Data;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface Api {
    @GET("homepage/")
    Observable<Data> getHomepageData();
}
