package com.example.mvvpbasicandroid.viewmodal;

import androidx.lifecycle.ViewModel;

import com.example.mvvpbasicandroid.modal.BaseMainModal;

public class MainViewModal extends ViewModel{

    BaseMainModal mModal;
    public BaseView.getKeyResponseInterface mIResponseInterface;
    public BaseView.LoginResponseInterface mLoginresponseInterface;

    public void setLoginParams(BaseView.LoginResponseInterface mainActivity, String email, String password){
        if(mModal == null){
            mModal = new BaseMainModal();
        }
        mLoginresponseInterface = mainActivity;
        mModal.CallApi(mainActivity,email,password);
    }
    public void getApiKey(BaseView.getKeyResponseInterface  response) {
        if(mModal == null){
            mModal = new BaseMainModal();
        }
        mIResponseInterface = response;
        mModal.CallApigetKey(response);
    }
    @Override
    protected void onCleared() {

    }

}
