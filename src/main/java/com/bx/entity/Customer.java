package com.bx.entity;

import java.io.Serializable;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:05:49
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = 177204444228548917L;
    
    private String cid;
    
    private Object createtime;
    
    private Object updatetime;
    /**
    * 创建客户的创建者的id
    */
    private String createorid;
    /**
    * 0:员工创建；1：APP User创建；默认0
    */
    private Integer source;
    
    private Integer stateus;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
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

    public String getCreateorid() {
        return createorid;
    }

    public void setCreateorid(String createorid) {
        this.createorid = createorid;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStateus() {
        return stateus;
    }

    public void setStateus(Integer stateus) {
        this.stateus = stateus;
    }

}