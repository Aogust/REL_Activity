package com.rel.dao;

import com.rel.entities.CouponInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponInfoMapper {

    int deleteByPrimaryKey(Integer iid);

    int insert(CouponInfo record);

    int insertSelective(CouponInfo record);


    CouponInfo selectByPrimaryKey(Integer iid);


    int updateByPrimaryKeySelective(CouponInfo record);

    int updateByPrimaryKey(CouponInfo record);
}