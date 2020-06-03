package com.bx.entity;

import java.io.Serializable;

/**
 * (PageageInsurproduct)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:08:24
 */
public class PageageInsurproduct implements Serializable {
    private static final long serialVersionUID = 319103276997761617L;
    
    private Integer id;
    
    private Integer proid;
    
    private Integer packageid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

}