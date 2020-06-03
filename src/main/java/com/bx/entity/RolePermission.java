package com.bx.entity;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:10:02
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -20355674548049327L;
    
    private Integer id;
    /**
    * 角色id
    */
    private Integer role;
    /**
    * 权限id
    */
    private Integer pid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}