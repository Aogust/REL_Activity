package com.rel.dao;

import com.rel.entities.LotteryRecord;
import com.rel.entities.LotteryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryRecordMapper {
    long countByExample(LotteryRecordExample example);

    int deleteByExample(LotteryRecordExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(LotteryRecord record);

    int insertSelective(LotteryRecord record);

    List<LotteryRecord> selectByExample(LotteryRecordExample example);

    LotteryRecord selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);

    int updateByExample(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);

    int updateByPrimaryKeySelective(LotteryRecord record);

    int updateByPrimaryKey(LotteryRecord record);
}