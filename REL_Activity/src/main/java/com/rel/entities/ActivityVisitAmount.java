package com.rel.entities;

import java.util.Date;

public class ActivityVisitAmount {
    private Integer iid;

    private Object appid;

    private Object activityName;

    private Object activityUid;

    private Integer visitAmount;

    private Date time;

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

    public Integer getVisitAmount() {
        return visitAmount;
    }

    public void setVisitAmount(Integer visitAmount) {
        this.visitAmount = visitAmount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}