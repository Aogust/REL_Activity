package com.rel.dao;

import com.rel.entities.AwardRecord;
import com.rel.entities.AwardRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardRecordMapper {
    long countByExample(AwardRecordExample example);

    int deleteByExample(AwardRecordExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(AwardRecord record);

    int insertSelective(AwardRecord record);

    List<AwardRecord> selectByExample(AwardRecordExample example);

    AwardRecord selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") AwardRecord record, @Param("example") AwardRecordExample example);

    int updateByExample(@Param("record") AwardRecord record, @Param("example") AwardRecordExample example);

    int updateByPrimaryKeySelective(AwardRecord record);

    int updateByPrimaryKey(AwardRecord record);
}