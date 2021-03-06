package com.example.ui.api;

import com.example.ui.model.cosmic.Data;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    String token  = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYXRhIjp7Il9pZCI6IjVlZDBiZWNjNTlhN2FiYjQ3Yzg2NDRhNCIsIm5hbWUiOiJwaHVjaG9hM3QifSwiaWF0IjoxNTk4NTA0MTg5LCJleHAiOjE1OTg1OTA1ODl9.6SHD-LPk2ZpK9ZIDZP40ZAlxRR4-H327rTZcVGO2HB4";
    @GET("homepage/")
    @Headers({
            "token: "+token,
            "device_id: phuchoa3t",
            "device: device name",
            "version: 1.18.0",
            "platform: android",
            "ignore: true"
    })
    Observable<Data> getHomepageData();

    String tokenNovel = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYXRhIjp7Il9pZCI6IjVlNzllYTQ5NWQzZjBhNTRjY2UzNDhiYSIsIm5hbWUiOiJUw6BpIFThuqEgxJDhu6ljIn0sImlhdCI6MTYwMDQwNDYyNywiZXhwIjoxNjAwNDkxMDI3fQ.ALZK7Q7X4wiYmxQtncIDolvixjcTUMxK-zwpgy5IAMg";
    @GET("novels/")
    @Headers({
            "token: "+tokenNovel,
            "device_id: phuchoa3t",
            "device: device name",
            "version: 1.18.0",
            "platform: android",
            "ignore: true"
    })
    Observable<Data> getNovelHomeData();
}
