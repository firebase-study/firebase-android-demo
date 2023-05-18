package com.example.firebase.android.demo.models;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String userName;
    public String email;
    public String appInstanceToken;

    public User() {
    }

    public User(String userName, String email, String appInstanceToken) {
        this.userName = userName;
        this.email = email;
        this.appInstanceToken = appInstanceToken;
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

    public String getAppInstanceToken() {
        return appInstanceToken;
    }

    public void setAppInstanceToken(String appInstanceToken) {
        this.appInstanceToken = appInstanceToken;
    }
}
