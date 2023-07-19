package com.bjpowernode.micrdataservice.mapper;

import com.bjpowernode.model.BidInfo;

import java.math.BigDecimal;

public interface BidInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BidInfo record);

    int insertSelective(BidInfo record);

    BidInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BidInfo record);

    int updateByPrimaryKey(BidInfo record);

    BigDecimal selectSumBidMoney();
}