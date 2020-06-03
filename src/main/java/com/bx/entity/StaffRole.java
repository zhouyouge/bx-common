package com.bx.entity;

import java.io.Serializable;

/**
 * (StaffRole)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:11:13
 */
public class StaffRole implements Serializable {
    private static final long serialVersionUID = -55564846249736689L;
    
    private Integer id;
    /**
    * 角色名称
    */
    private String name;
    /**
    * 角色描述
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