package com.bx.entity;

import java.io.Serializable;

/**
 * (StaffPermission)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:12:55
 */
public class StaffPermission implements Serializable {
    private static final long serialVersionUID = 741728399299141828L;
    /**
    * 权限ID
    */
    private Integer id;
    /**
    * 权限名称
    */
    private String name;
    /**
    * 权限描述
    */
    private String description;
    
    private Object createtime;
    
    private Object updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

}