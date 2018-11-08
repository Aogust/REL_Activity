package com.rel.dao;

import com.rel.entities.LotteryAmount;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryAmountMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(LotteryAmount record);

    int insertSelective(LotteryAmount record);


    LotteryAmount selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(LotteryAmount record);

    int updateByPrimaryKey(LotteryAmount record);
}