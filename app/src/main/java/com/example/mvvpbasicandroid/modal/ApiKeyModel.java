package com.example.mvvpbasicandroid.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ApiKeyModel implements Parcelable {

    public static final Creator<ApiKeyModel> CREATOR = new Creator<ApiKeyModel>() {
        @Override
        public ApiKeyModel createFromParcel(Parcel in) {
            return new ApiKeyModel(in);
        }

        @Override
        public ApiKeyModel[] newArray(int size) {
            return new ApiKeyModel[size];
        }
    };
    @SerializedName("apiKey")
    private
    String apiKey;
    @SerializedName("apiKeyID")
    private
    String apiKeyID;

    private ApiKeyModel(Parcel in) {
        apiKey = in.readString();
        apiKeyID = in.readString();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getapiKeyID() {
        return apiKeyID;
    }

    public void setapiKeyID(String apiKeyID) {
        this.apiKeyID = apiKeyID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(apiKey);
        dest.writeString(apiKeyID);
    }
}
