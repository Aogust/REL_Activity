package com.rel.dao;

import com.rel.entities.ActivityVisitAmount;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityVisitAmountMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(ActivityVisitAmount record);

    int insertSelective(ActivityVisitAmount record);


    ActivityVisitAmount selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(ActivityVisitAmount record);

    int updateByPrimaryKey(ActivityVisitAmount record);
}