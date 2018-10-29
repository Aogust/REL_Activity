package com.rel.dao;

import com.rel.entities.ActivityName;
import com.rel.entities.ActivityNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityNameMapper {
    long countByExample(ActivityNameExample example);

    int deleteByExample(ActivityNameExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(ActivityName record);

    int insertSelective(ActivityName record);

    List<ActivityName> selectByExample(ActivityNameExample example);

    ActivityName selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") ActivityName record, @Param("example") ActivityNameExample example);

    int updateByExample(@Param("record") ActivityName record, @Param("example") ActivityNameExample example);

    int updateByPrimaryKeySelective(ActivityName record);

    int updateByPrimaryKey(ActivityName record);
}