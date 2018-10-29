package com.rel.entities;

import java.util.Date;

public class ActivityName {
    private Integer iid;

    private Object appid;

    private Object activityName;

    private Object activityUid;

    private Integer lotteryNumber;

    private Integer lotteryState;

    private Date beginTime;

    private Date endTime;

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

    public Integer getLotteryNumber() {
        return lotteryNumber;
    }

    public void setLotteryNumber(Integer lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    public Integer getLotteryState() {
        return lotteryState;
    }

    public void setLotteryState(Integer lotteryState) {
        this.lotteryState = lotteryState;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}