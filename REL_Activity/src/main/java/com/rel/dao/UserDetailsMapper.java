package com.rel.dao;

import com.rel.entities.UserDetails;
import com.rel.entities.UserDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailsMapper {
    long countByExample(UserDetailsExample example);

    int deleteByExample(UserDetailsExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    List<UserDetails> selectByExample(UserDetailsExample example);

    UserDetails selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") UserDetails record, @Param("example") UserDetailsExample example);

    int updateByExample(@Param("record") UserDetails record, @Param("example") UserDetailsExample example);

    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);
}