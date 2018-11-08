package com.rel.dao;

import com.rel.entities.PrizeInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeInfoMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(PrizeInfo record);

    int insertSelective(PrizeInfo record);


    PrizeInfo selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(PrizeInfo record);

    int updateByPrimaryKey(PrizeInfo record);
}