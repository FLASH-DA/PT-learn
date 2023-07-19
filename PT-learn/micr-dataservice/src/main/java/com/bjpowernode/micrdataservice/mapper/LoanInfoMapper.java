package com.bjpowernode.micrdataservice.mapper;

import com.bjpowernode.model.LoanInfo;

import java.math.BigDecimal;

public interface LoanInfoMapper {
    BigDecimal selectAvgRate();

    int deleteByPrimaryKey(Integer id);

    int insert(LoanInfo record);

    int insertSelective(LoanInfo record);

    LoanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanInfo record);

    int updateByPrimaryKey(LoanInfo record);
}