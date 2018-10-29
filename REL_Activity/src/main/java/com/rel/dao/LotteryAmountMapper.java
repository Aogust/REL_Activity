package com.rel.dao;

import com.rel.entities.LotteryAmount;
import com.rel.entities.LotteryAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryAmountMapper {
    long countByExample(LotteryAmountExample example);

    int deleteByExample(LotteryAmountExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(LotteryAmount record);

    int insertSelective(LotteryAmount record);

    List<LotteryAmount> selectByExample(LotteryAmountExample example);

    LotteryAmount selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") LotteryAmount record, @Param("example") LotteryAmountExample example);

    int updateByExample(@Param("record") LotteryAmount record, @Param("example") LotteryAmountExample example);

    int updateByPrimaryKeySelective(LotteryAmount record);

    int updateByPrimaryKey(LotteryAmount record);
}