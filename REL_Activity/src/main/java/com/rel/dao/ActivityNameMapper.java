package com.rel.dao;

import com.rel.entities.ActivityName;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityNameMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(ActivityName record);

    int insertSelective(ActivityName record);

    ActivityName selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(ActivityName record);

    int updateByPrimaryKey(ActivityName record);
}