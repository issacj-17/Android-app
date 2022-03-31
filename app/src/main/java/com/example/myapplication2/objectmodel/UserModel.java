package com.example.myapplication2.objectmodel;

import com.google.firebase.firestore.DocumentReference;

import java.util.Date;

/*
* Firebase Firestore Document Object Model for the Users Collection
* @field dateCreated: timestamp
* @field email: string
* @field password: string
* @field profile: DocumentReference from Profiles Collection
* @field username: string
*/
public class UserModel {

    public static final String TAG = "User Model";
    public static final String collectionId = "Users";

    private Date dateCreated;
    private String email;
    private String password;
    private DocumentReference profile;
    private String username;

    public UserModel() {
    }

    public UserModel(Date dateCreated, String email, String password, DocumentReference profile, String username) {
        this.dateCreated = dateCreated;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.username = username;
    }

    public Date getdateCreated() {
        return dateCreated;
    }

    public void setdateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "UserModel{" +
                "dateCreated=" + dateCreated +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                ", username='" + username + '\'' +
                '}';
    }
}
