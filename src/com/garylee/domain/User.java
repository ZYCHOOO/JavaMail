package com.garylee.domain;

import java.io.Serializable;

public class User implements Serializable{
    private String user;
    private String upassword;

    public User(){

    }
    public User(String user, String upassword) {
        this.user = user;
        this.upassword = upassword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
