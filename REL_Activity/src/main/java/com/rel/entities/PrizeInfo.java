package com.rel.entities;

import java.util.Date;

public class PrizeInfo {
    private Integer iid;

    private Object appid;

    private Object activityName;

    private Object activityUid;

    private Object prizeName;

    private Object prizeUid;

    private Object picUrl;

    private Integer prizeAmount;

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

    public Object getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(Object picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
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