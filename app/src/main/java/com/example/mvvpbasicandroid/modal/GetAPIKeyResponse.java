
package com.example.mvvpbasicandroid.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Observable;

public class GetAPIKeyResponse extends Observable implements Parcelable {
    public static final Creator<GetAPIKeyResponse> CREATOR = new Creator<GetAPIKeyResponse>() {
        @Override
        public GetAPIKeyResponse createFromParcel(Parcel in) {
            return new GetAPIKeyResponse(in);
        }

        @Override
        public GetAPIKeyResponse[] newArray(int size) {
            return new GetAPIKeyResponse[size];
        }
    };
    /**
     * status : 1
     * message : success
     * data : {"apiKey":"x0hqfk6n18jiilv2p7ucwed5zbxy9sg3mpaat4or","apiKeyID":15}
     */

    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private ApiKeyModel data;

    protected GetAPIKeyResponse(Parcel in) {
        status = in.readInt();
        message = in.readString();
        data = in.readParcelable(ApiKeyModel.class.getClassLoader());
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ApiKeyModel getData() {
        return data;
    }

    public void setData(ApiKeyModel data) {
        this.data = data;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(status);
        parcel.writeString(message);
        parcel.writeParcelable(data, i);
    }
}
