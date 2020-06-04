package com.bx.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (StaffInfo)实体类
 *
 * @author makejava
 * @since 2020-06-03 19:10:22
 */
public class StaffInfo implements Serializable {
    private static final long serialVersionUID = -41137512864536894L;
    /**
    * 员工编号
    */
    private String staffId;
    /**
    * 登录账户
    */
    private String staffUser;
    /**
    * 登录密码
    */
    private String staffPassword;
    /**
    * 工号：410+六位随机数+当前时间戳
    */
    private String staffCode;
    
    private Object createtime;
    
    private Object updatetime;
    /**
    * 0：在线；1：离线
    */
    private Integer status;
    /**
     * 0在职  1离职
     */
    private  Integer status2;

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }
    /**
     * 一个用户可能有多个角色
     */
    private List<StaffRole> staffRoles;

    public List<StaffRole> getStaffRoles() {
        return staffRoles;
    }

    public void setStaffRoles(List<StaffRole> staffRoles) {
        this.staffRoles = staffRoles;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffUser() {
        return staffUser;
    }

    public void setStaffUser(String staffUser) {
        this.staffUser = staffUser;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}