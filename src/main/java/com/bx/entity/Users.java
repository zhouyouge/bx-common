package com.bx.entity;

import java.io.Serializable;

public class Users implements Serializable {
   private String userName;
   private  Integer password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
