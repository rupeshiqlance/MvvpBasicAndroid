package com.example.mvvpbasicandroid.repository;

import com.example.mvvpbasicandroid.Api.ApiClient;
import com.example.mvvpbasicandroid.Api.ApiInterface;
import com.example.mvvpbasicandroid.modal.GetAPIKeyResponse;
import com.example.mvvpbasicandroid.modal.LoginResponse;
import io.reactivex.Observable;

public class Repository {
    private ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    private Observable<LoginResponse> observable;
    private Observable<GetAPIKeyResponse> observableGetKey;

    public Observable<LoginResponse>
    getloginrespository(String email, String password){
        observable = apiService.login(email,password);
        return observable;
    }

    public Observable<GetAPIKeyResponse>
    getKeyRepository() {
        observableGetKey = apiService.getAPIKey();
        return observableGetKey;
    }

}
