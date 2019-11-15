package com.example.mvvpbasicandroid.Api;

import androidx.lifecycle.LiveData;

import com.example.mvvpbasicandroid.modal.GetAPIKeyResponse;
import com.example.mvvpbasicandroid.modal.LoginResponse;


import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    //get API Key

    @GET("getApiKey/")
    Observable<GetAPIKeyResponse> getAPIKey();

    @FormUrlEncoded
    @POST("login/")
    Observable<LoginResponse> login(@Field("email") String email, @Field("password") String password);

    /*
    *  @GET("getApiKey/")
    Single<GetAPIKeyResponse> getAPIKey();
    @FormUrlEncoded
    @POST("login/")
    Single<LoginResponse> login(@Field("email") String email, @Field("password") String password);
    * */
}
