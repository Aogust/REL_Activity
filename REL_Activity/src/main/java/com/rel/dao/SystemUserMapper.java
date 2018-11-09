package com.rel.dao;

import com.rel.entities.SystemUser;
import java.util.List;

public interface SystemUserMapper {

  
   
    List<SystemUser> selectByUserName(String userid);

}