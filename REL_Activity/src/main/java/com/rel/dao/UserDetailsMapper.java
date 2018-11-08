package com.rel.dao;

import com.rel.entities.UserDetails;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailsMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);


    UserDetails selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);
}