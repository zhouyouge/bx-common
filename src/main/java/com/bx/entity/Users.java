package com.bx.entity;

import java.io.Serializable;

public class Users implements Serializable {
   private String userName;
   private  Integer password;
private  String id;

   private String abc;
   //我测试gitHub和本地不一样的时候的冲突第一次测试
   //第二次测试 两个版本全部保留
   
   //第三次测试 只保留一个
//第四次测试
   //第五次测试

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
