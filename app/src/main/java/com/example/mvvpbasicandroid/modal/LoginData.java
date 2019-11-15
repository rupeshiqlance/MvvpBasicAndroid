package com.example.mvvpbasicandroid.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Observable;

public class LoginData extends Observable implements Parcelable {

    public static final Creator<LoginData> CREATOR = new Creator<LoginData>() {
        @Override
        public LoginData createFromParcel(Parcel in) {
            return new LoginData(in);
        }

        @Override
        public LoginData[] newArray(int size) {
            return new LoginData[size];
        }
    };
    @SerializedName("aboutUser")
    private String mAboutUser;
    @SerializedName("accessToken")
    private String mAccessToken;
    @SerializedName("birthDay")
    private String mBirthDay;
    @SerializedName("countryID")
    private String mCountryID;
    @SerializedName("createdAt")
    private String mCreatedAt;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("fullName")
    private String mFullName;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("ipAddress")
    private String mIpAddress;
    @SerializedName("isDeleted")
    private String mIsDeleted;
    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("loginType")
    private String mLoginType;
    @SerializedName("longitude")
    private String mLongitude;
    @SerializedName("onlineStatus")
    private String mOnlineStatus;
    @SerializedName("phoneNumber")
    private String mPhoneNumber;
    @SerializedName("relationship")
    private String mRelationship;
    @SerializedName("socialID")
    private Object mSocialID;
    @SerializedName("stateID")
    private String mStateID;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("updatedAt")
    private String mUpdatedAt;
    @SerializedName("userAvatar")
    private List<UserAvatar> mUserAvatar;
    @SerializedName("userID")
    private String mUserID;

    protected LoginData(Parcel in) {
        mAboutUser = in.readString();
        mAccessToken = in.readString();
        mBirthDay = in.readString();
        mCountryID = in.readString();
        mCreatedAt = in.readString();
        mEmail = in.readString();
        mFullName = in.readString();
        mGender = in.readString();
        mIpAddress = in.readString();
        mIsDeleted = in.readString();
        mLatitude = in.readString();
        mLocation = in.readString();
        mLoginType = in.readString();
        mLongitude = in.readString();
        mOnlineStatus = in.readString();
        mPhoneNumber = in.readString();
        mRelationship = in.readString();
        mStateID = in.readString();
        mStatus = in.readString();
        mUpdatedAt = in.readString();
        mUserID = in.readString();
    }

    public String getAboutUser() {
        return mAboutUser;
    }

    public void setAboutUser(String aboutUser) {
        mAboutUser = aboutUser;
    }

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public String getBirthDay() {
        return mBirthDay;
    }

    public void setBirthDay(String birthDay) {
        mBirthDay = birthDay;
    }

    public String getCountryID() {
        return mCountryID;
    }

    public void setCountryID(String countryID) {
        mCountryID = countryID;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getIpAddress() {
        return mIpAddress;
    }

    public void setIpAddress(String ipAddress) {
        mIpAddress = ipAddress;
    }

    public String getIsDeleted() {
        return mIsDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        mIsDeleted = isDeleted;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getLoginType() {
        return mLoginType;
    }

    public void setLoginType(String loginType) {
        mLoginType = loginType;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

    public String getOnlineStatus() {
        return mOnlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        mOnlineStatus = onlineStatus;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getRelationship() {
        return mRelationship;
    }

    public void setRelationship(String relationship) {
        mRelationship = relationship;
    }

    public Object getSocialID() {
        return mSocialID;
    }

    public void setSocialID(Object socialID) {
        mSocialID = socialID;
    }

    public String getStateID() {
        return mStateID;
    }

    public void setStateID(String stateID) {
        mStateID = stateID;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public List<UserAvatar> getUserAvatar() {
        return mUserAvatar;
    }

    public void setUserAvatar(List<UserAvatar> userAvatar) {
        mUserAvatar = userAvatar;
    }

    public String getUserID() {
        return mUserID;
    }

    public void setUserID(String userID) {
        mUserID = userID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mAboutUser);
        parcel.writeString(mAccessToken);
        parcel.writeString(mBirthDay);
        parcel.writeString(mCountryID);
        parcel.writeString(mCreatedAt);
        parcel.writeString(mEmail);
        parcel.writeString(mFullName);
        parcel.writeString(mGender);
        parcel.writeString(mIpAddress);
        parcel.writeString(mIsDeleted);
        parcel.writeString(mLatitude);
        parcel.writeString(mLocation);
        parcel.writeString(mLoginType);
        parcel.writeString(mLongitude);
        parcel.writeString(mOnlineStatus);
        parcel.writeString(mPhoneNumber);
        parcel.writeString(mRelationship);
        parcel.writeString(mStateID);
        parcel.writeString(mStatus);
        parcel.writeString(mUpdatedAt);
        parcel.writeString(mUserID);
    }
}
