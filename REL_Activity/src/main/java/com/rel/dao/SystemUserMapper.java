package com.rel.dao;

import com.rel.entities.SystemUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);


    SystemUser selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);
}