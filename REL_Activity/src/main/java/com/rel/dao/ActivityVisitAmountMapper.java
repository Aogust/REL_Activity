package com.rel.dao;

import com.rel.entities.ActivityVisitAmount;
import com.rel.entities.ActivityVisitAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityVisitAmountMapper {
    long countByExample(ActivityVisitAmountExample example);

    int deleteByExample(ActivityVisitAmountExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(ActivityVisitAmount record);

    int insertSelective(ActivityVisitAmount record);

    List<ActivityVisitAmount> selectByExample(ActivityVisitAmountExample example);

    ActivityVisitAmount selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") ActivityVisitAmount record, @Param("example") ActivityVisitAmountExample example);

    int updateByExample(@Param("record") ActivityVisitAmount record, @Param("example") ActivityVisitAmountExample example);

    int updateByPrimaryKeySelective(ActivityVisitAmount record);

    int updateByPrimaryKey(ActivityVisitAmount record);
}