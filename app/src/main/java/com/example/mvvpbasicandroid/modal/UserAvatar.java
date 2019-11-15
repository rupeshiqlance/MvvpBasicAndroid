package com.example.mvvpbasicandroid.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Observable;

public class UserAvatar extends Observable implements Parcelable {

    @SerializedName("userAvatar")
    private String mUserAvatar;
    @SerializedName("userAvatarID")
    private String mUserAvatarID;

    public static final Creator<UserAvatar> CREATOR = new Creator<UserAvatar>() {
        @Override
        public UserAvatar createFromParcel(Parcel in) {
            return new UserAvatar(in);
        }

        @Override
        public UserAvatar[] newArray(int size) {
            return new UserAvatar[size];
        }
    };

    protected UserAvatar(Parcel in) {
        mUserAvatar = in.readString();
        mUserAvatarID = in.readString();
    }

    public UserAvatar() {
    }


    public String getUserAvatar() {
        return mUserAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        mUserAvatar = userAvatar;
    }

    public String getUserAvatarID() {
        return mUserAvatarID;
    }

    public void setUserAvatarID(String userAvatarID) {
        mUserAvatarID = userAvatarID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUserAvatar);
        parcel.writeString(mUserAvatarID);
    }
}
