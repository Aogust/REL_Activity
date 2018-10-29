package com.rel.dao;

import com.rel.entities.PrizeInfo;
import com.rel.entities.PrizeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeInfoMapper {
    long countByExample(PrizeInfoExample example);

    int deleteByExample(PrizeInfoExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(PrizeInfo record);

    int insertSelective(PrizeInfo record);

    List<PrizeInfo> selectByExample(PrizeInfoExample example);

    PrizeInfo selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);

    int updateByExample(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);

    int updateByPrimaryKeySelective(PrizeInfo record);

    int updateByPrimaryKey(PrizeInfo record);
}