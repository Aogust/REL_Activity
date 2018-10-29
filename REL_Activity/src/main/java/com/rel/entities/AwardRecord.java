package com.rel.entities;

import java.util.Date;

public class AwardRecord {
    private Integer iid;

    private Object appid;

    private Object activityName;

    private Object activityUid;

    private Object openId;

    private Object prizeName;

    private Object prizeUid;

    private Object couponName;

    private Object couponUid;

    private Date createTime;

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

    public Object getOpenId() {
        return openId;
    }

    public void setOpenId(Object openId) {
        this.openId = openId;
    }

    public Object getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(Object prizeName) {
        this.prizeName = prizeName;
    }

    public Object getPrizeUid() {
        return prizeUid;
    }

    public void setPrizeUid(Object prizeUid) {
        this.prizeUid = prizeUid;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}