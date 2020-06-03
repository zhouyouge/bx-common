package com.bx.entity;

import java.io.Serializable;

/**
 * (Customerinfo)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:06:25
 */
public class Customerinfo implements Serializable {
    private static final long serialVersionUID = 986953928191350736L;
    /**
    * 编号
    */
    private String id;
    /**
    * 用户编号
    */
    private String userid;
    /**
    * 姓名
    */
    private String username;
    /**
    * 出生日期
    */
    private Object birthday;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 地址
    */
    private String address;
    /**
    * 性别
    */
    private Integer sex;
    /**
    * 电子邮箱
    */
    private String email;
    /**
    * 身份证号
    */
    private String identitycard;
    
    private Object createtime;
    
    private Object updatetime;
    /**
    * 1：APP端用户；2：员工；3：客户
    */
    private Integer type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public Object getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Object createtime) {
        this.createtime = createtime;
    }

    public Object getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Object updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}