package com.rel.dao;

import com.rel.entities.AppidInfos;
import com.rel.entities.AppidInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppidInfosMapper {
    long countByExample(AppidInfosExample example);

    int deleteByExample(AppidInfosExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(AppidInfos record);

    int insertSelective(AppidInfos record);

    List<AppidInfos> selectByExample(AppidInfosExample example);

    AppidInfos selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") AppidInfos record, @Param("example") AppidInfosExample example);

    int updateByExample(@Param("record") AppidInfos record, @Param("example") AppidInfosExample example);

    int updateByPrimaryKeySelective(AppidInfos record);

    int updateByPrimaryKey(AppidInfos record);
}