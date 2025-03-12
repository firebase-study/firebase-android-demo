package com.example.firebase.android.demo.models;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String userName;
    public String email;
    public String deviceToken;
    public String terminalType;

    public User() {
    }

    public User(String userName, String email, String deviceToken, String terminalType) {
        this.userName = userName;
        this.email = email;
        this.deviceToken = deviceToken;
        this.terminalType = terminalType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
