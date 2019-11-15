package com.example.mvvpbasicandroid.modal;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvpbasicandroid.repository.Repository;
import com.example.mvvpbasicandroid.rx.AppSchedulerProvider;
import com.example.mvvpbasicandroid.viewmodal.BaseView;
import io.reactivex.disposables.CompositeDisposable;

public class BaseMainModal extends AppSchedulerProvider{

    CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    Repository mRepository =new Repository();
    public void CallApi(BaseView.LoginResponseInterface mLoginResponseListener, String email, String password) {
        MutableLiveData<LoginResponse> mdata;
        mdata =new MutableLiveData<LoginResponse>();
        mCompositeDisposable.add(mRepository.getloginrespository(email,password)
                .subscribeOn(io())
                .observeOn(ui())
                .subscribe(getAPIKeyResponse ->{
                    mdata.setValue(getAPIKeyResponse);
                    mLoginResponseListener.onLoginSucess(mdata);
                },error ->{
                    mLoginResponseListener.onLoginFails(error.getMessage());
                },()->{
                    Log.e("Call","Finish");
                }));
    }
    public void CallApigetKey(final BaseView.getKeyResponseInterface mApiKeyResponseListener) {

        MutableLiveData<GetAPIKeyResponse> mdata =new MutableLiveData<GetAPIKeyResponse>();
        mCompositeDisposable.add(mRepository.getKeyRepository()
                .subscribeOn(io())
                .observeOn(ui())
                .subscribe(getAPIKeyResponse -> {
                        mdata.setValue(getAPIKeyResponse);
                        mApiKeyResponseListener.onSucess(mdata);
                    },error ->{
                         mApiKeyResponseListener.onFails(error.getMessage());
                    },()->{
                        Log.e("Call","Finish");
                    }));

    }
}
