package com.example.mvvpbasicandroid.repository;

import com.example.mvvpbasicandroid.Api.ApiClient;
import com.example.mvvpbasicandroid.Api.ApiInterface;
import com.example.mvvpbasicandroid.modal.GetAPIKeyResponse;
import com.example.mvvpbasicandroid.modal.LoginResponse;
import io.reactivex.Observable;

public class Repository {

    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

    public Observable<LoginResponse> getloginrespository(String email, String password){
        Observable<LoginResponse> observable = apiService.login(email,password);
        return observable;
    }
    public Observable<GetAPIKeyResponse> getKeyRepository() {
        Observable<GetAPIKeyResponse> observable = apiService.getAPIKey();
        return observable;
    }

}
