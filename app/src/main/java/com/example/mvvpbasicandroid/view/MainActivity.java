package com.example.mvvpbasicandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.example.mvvpbasicandroid.Api.SharedPreferenceManager;
import com.example.mvvpbasicandroid.R;
import com.example.mvvpbasicandroid.modal.GetAPIKeyResponse;
import com.example.mvvpbasicandroid.modal.LoginResponse;
import com.example.mvvpbasicandroid.viewmodal.MainViewModal;
import com.example.mvvpbasicandroid.viewmodal.BaseView;
import com.google.gson.Gson;
import javax.inject.Inject;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class MainActivity extends AppCompatActivity
        implements BaseView.getKeyResponseInterface,
        BaseView.LoginResponseInterface,BaseView,
        AppConstants{

    MainViewModal viewModal;

    @BindView(R.id.edEmail)
    AppCompatEditText edEmail;

    @BindView(R.id.edPassword)
    AppCompatEditText edPassword;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        SharedPreferenceManager.init(this);
        viewModal = ViewModelProviders.of(this,viewModelFactory).get(MainViewModal.class);
        viewModal.getApiKey(this);
    }

    @OnClick({R.id.btLogin})
    public void onClick(View v){
        if (v.getId() == R.id.btLogin) {
            callLoginApi();
        }
    }

    private void callLoginApi() {
        viewModal.setLoginParams(this,edEmail.getText().toString(),edPassword.getText().toString());
    }

    @Override
    public void onSucess(MutableLiveData<GetAPIKeyResponse> mgetArraykey) {
        mgetArraykey.observe(this, new Observer<GetAPIKeyResponse>() {
            @Override
            public void onChanged(GetAPIKeyResponse getAPIKeyResponse) {
                Log.e("GetKeyResponse", new Gson().toJson(getAPIKeyResponse));
                SharedPreferenceManager.putString(API_KEY_VALUE, getAPIKeyResponse.getData().getApiKey());
                Toast.makeText(MainActivity.this, new Gson().toJson(getAPIKeyResponse), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onFails(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginSucess(MutableLiveData<LoginResponse> mArrayLogin) {
        mArrayLogin.observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse mLoginResponse) {
                Log.e("LoginREsponse", new Gson().toJson(mLoginResponse));
                Toast.makeText(MainActivity.this, new Gson().toJson(mLoginResponse), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onLoginFails(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ShowProgress() {

    }

    @Override
    public void HideProgress() {

    }
}
