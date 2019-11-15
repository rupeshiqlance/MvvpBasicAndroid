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
    public void CallApi(BaseView.LoginResponseInterface mainActivity, String email, String password) {
        MutableLiveData<LoginResponse> mdata;
        mdata =new MutableLiveData<LoginResponse>();
        mCompositeDisposable.add(mRepository.getloginrespository(email,password)
                .subscribeOn(io())
                .observeOn(ui())
                .subscribe(getAPIKeyResponse ->{
                    mdata.setValue(getAPIKeyResponse);
                    mainActivity.onLoginSucess(mdata);
                },error ->{
                    mainActivity.onLoginFails(error.getMessage());
                },()->{
                    Log.e("Call","Finish");
                }));
    }
    public void CallApigetKey(final BaseView.getKeyResponseInterface getresponse) {

        MutableLiveData<GetAPIKeyResponse> mdata =new MutableLiveData<GetAPIKeyResponse>();
        mCompositeDisposable.add(mRepository.getKeyRepository()
                .subscribeOn(io())
                .observeOn(ui())
                .subscribe(getAPIKeyResponse -> {
                        mdata.setValue(getAPIKeyResponse);
                        getresponse.onSucess(mdata);
                    },error ->{
                         getresponse.onFails(error.getMessage());
                    },()->{
                        Log.e("Call","Finish");
                    }));

    }
}
