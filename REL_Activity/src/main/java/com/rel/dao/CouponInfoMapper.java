package com.rel.dao;

import com.rel.entities.CouponInfo;
import com.rel.entities.CouponInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponInfoMapper {
    long countByExample(CouponInfoExample example);

    int deleteByExample(CouponInfoExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(CouponInfo record);

    int insertSelective(CouponInfo record);

    List<CouponInfo> selectByExample(CouponInfoExample example);

    CouponInfo selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    int updateByExample(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    int updateByPrimaryKeySelective(CouponInfo record);

    int updateByPrimaryKey(CouponInfo record);
}