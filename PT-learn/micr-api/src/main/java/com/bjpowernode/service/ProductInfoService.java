package com.bjpowernode.service;

import com.bjpowernode.model.LoanInfo;
import com.bjpowernode.pojo.MultiProduct;

import java.util.List;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface ProductInfoService {
    List<LoanInfo> queryByTypeLimit(Integer pType,Integer pageNo,Integer pageSize);

    Integer queryRecordNumsByType(Integer pType);

    MultiProduct queryIndexPageProducts();

    
}
