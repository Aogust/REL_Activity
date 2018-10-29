package com.rel.entities;

import java.util.Date;

public class SystemUser {
    private Integer iid;

    private Object userName;

    private Object password;

    private Integer roleId;

    private Object appid;

    private Object publicNumberName;

    private Object organization;

    private Object contentPerson;

    private Integer contentNumber;

    private Object keyPath;

    private Integer isRefresh;

    private Date createTime;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Object getAppid() {
        return appid;
    }

    public void setAppid(Object appid) {
        this.appid = appid;
    }

    public Object getPublicNumberName() {
        return publicNumberName;
    }

    public void setPublicNumberName(Object publicNumberName) {
        this.publicNumberName = publicNumberName;
    }

    public Object getOrganization() {
        return organization;
    }

    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    public Object getContentPerson() {
        return contentPerson;
    }

    public void setContentPerson(Object contentPerson) {
        this.contentPerson = contentPerson;
    }

    public Integer getContentNumber() {
        return contentNumber;
    }

    public void setContentNumber(Integer contentNumber) {
        this.contentNumber = contentNumber;
    }

    public Object getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(Object keyPath) {
        this.keyPath = keyPath;
    }

    public Integer getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}