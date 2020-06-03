package com.bx.entity;

import java.io.Serializable;

/**
 * (OrgArea)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:07:55
 */
public class OrgArea implements Serializable {
    private static final long serialVersionUID = 684741802702927181L;
    /**
    * 分区编号（关联员工表，指定员工属于哪个分区）
    */
    private Integer id;
    /**
    * 分区名称
    */
    private String orgName;
    /**
    * 所属区域
    */
    private String area;
    
    private Object createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Object getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Object createtime) {
        this.createtime = createtime;
    }

}