package com.rel.dao;

import com.rel.entities.LotteryRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryRecordMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(LotteryRecord record);

    int insertSelective(LotteryRecord record);


    LotteryRecord selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(LotteryRecord record);

    int updateByPrimaryKey(LotteryRecord record);
}