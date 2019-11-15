package com.example.mvvpbasicandroid.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Observable;

public class LoginResponse extends Observable implements Parcelable {

    @SerializedName("data")
    private LoginData mLoginData;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("status")
    private Long mStatus;

    public static final Creator<LoginResponse> CREATOR = new Creator<LoginResponse>() {
        @Override
        public LoginResponse createFromParcel(Parcel in) {
            return new LoginResponse(in);
        }

        @Override
        public LoginResponse[] newArray(int size) {
            return new LoginResponse[size];
        }
    };

    protected LoginResponse(Parcel in) {
        mLoginData = in.readParcelable(LoginData.class.getClassLoader());
        mMessage = in.readString();
        if (in.readByte() == 0) {
            mStatus = null;
        } else {
            mStatus = in.readLong();
        }
    }

    public LoginData getLoginData() {
        return mLoginData;
    }

    public void setLoginData(LoginData loginData) {
        mLoginData = loginData;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mLoginData, i);
        parcel.writeString(mMessage);
        if (mStatus == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(mStatus);
        }
    }
}
