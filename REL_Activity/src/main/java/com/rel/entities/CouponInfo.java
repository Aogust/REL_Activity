package com.rel.entities;

import java.util.Date;

public class CouponInfo {
    private Integer iid;

    private Object appid;

    private Object activityName;

    private Object activityUid;

    private Object couponName;

    private Object couponUid;

    private Object picUrl;

    private Integer couponAmount;

    private Integer remainAmount;

    private Date createTime;

    private Date modifyTime;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Object getAppid() {
        return appid;
    }

    public void setAppid(Object appid) {
        this.appid = appid;
    }

    public Object getActivityName() {
        return activityName;
    }

    public void setActivityName(Object activityName) {
        this.activityName = activityName;
    }

    public Object getActivityUid() {
        return activityUid;
    }

    public void setActivityUid(Object activityUid) {
        this.activityUid = activityUid;
    }

    public Object getCouponName() {
        return couponName;
    }

    public void setCouponName(Object couponName) {
        this.couponName = couponName;
    }

    public Object getCouponUid() {
        return couponUid;
    }

    public void setCouponUid(Object couponUid) {
        this.couponUid = couponUid;
    }

    public Object getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(Object picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Integer remainAmount) {
        this.remainAmount = remainAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}