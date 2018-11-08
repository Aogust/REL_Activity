package com.rel.dao;

import com.rel.entities.AwardRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardRecordMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(AwardRecord record);

    int insertSelective(AwardRecord record);


    AwardRecord selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(AwardRecord record);

    int updateByPrimaryKey(AwardRecord record);
}