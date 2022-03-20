package com.example.myapplication2.objectmodel;

import com.google.firebase.firestore.DocumentReference;

import java.util.Date;

public class UsersModel {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DocumentReference getProfile() {
        return profile;
    }

    public void setProfile(DocumentReference profile) {
        this.profile = profile;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;
    private String name;
    private String password;
    private DocumentReference profile;
    private Date userCreated;
    private String username;

    public UsersModel() { }

    public UsersModel(String email, String name, String password, DocumentReference profile, Date userCreated, String username) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.profile = profile;
        this.userCreated = userCreated;
        this.username = username;
    }
}
