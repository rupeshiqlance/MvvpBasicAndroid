package com.example.mvvpbasicandroid.viewmodal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvpbasicandroid.modal.GetAPIKeyResponse;
import com.example.mvvpbasicandroid.modal.LoginResponse;
import com.example.mvvpbasicandroid.view.MainView;

public interface BaseView extends MainView{
    interface getKeyResponseInterface{
        void onSucess(MutableLiveData<GetAPIKeyResponse> directionList);
        void onFails(String message);
    }
    interface LoginResponseInterface{
        void onLoginSucess(MutableLiveData<LoginResponse> directionList);
        void onLoginFails(String message);
    }

}
