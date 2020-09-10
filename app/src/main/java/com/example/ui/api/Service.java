package com.example.ui.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    private static Service service;

    private Service(){

    }

    public static Service getInstance(){
        if(service == null){
            service = new Service();
        }
        return service;
    }

    public Api getApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dev-api.funtoon.vn/api/v1/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Api.class);
    }
}
