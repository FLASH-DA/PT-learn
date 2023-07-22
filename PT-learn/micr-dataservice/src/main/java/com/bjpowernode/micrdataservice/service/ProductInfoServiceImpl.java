package com.bjpowernode.micrdataservice.service;

import com.bjpowernode.micrdataservice.mapper.LoanInfoMapper;
import com.bjpowernode.model.LoanInfo;
import com.bjpowernode.pojo.MultiProduct;
import com.bjpowernode.service.ProductInfoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ProductInfoServiceImpl implements ProductInfoService {
    @Resource
    private LoanInfoMapper loanInfoMapper;

    @Override
    public List<LoanInfo> queryByTypeLimit(Integer pType, Integer pageNo, Integer pageSize) {
        ArrayList<LoanInfo> loanInfos = new ArrayList<>();
        if (pType == 0 || pType==1 || pType==2){
//            pageNo = CommonUtil.defaultPageNo(pageNo);
//            pageSize = CommonUtil.defaultPageSize(pageSize);
//            int offset  = (pageNo - 1) * pageSize;
//            productInfos = productInfoMapper.selectByTypeLimit(pType, offset, pageSize);
        }
            return null;
    }

    @Override
    public Integer queryRecordNumsByType(Integer pType) {
        return null;
    }

    @Override
    public MultiProduct queryIndexPageProducts() {
        return null;
    }
}
