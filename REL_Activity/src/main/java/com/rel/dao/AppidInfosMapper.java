package com.rel.dao;

import com.rel.entities.AppidInfos;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppidInfosMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(AppidInfos record);

    int insertSelective(AppidInfos record);


    AppidInfos selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(AppidInfos record);

    int updateByPrimaryKey(AppidInfos record);
}