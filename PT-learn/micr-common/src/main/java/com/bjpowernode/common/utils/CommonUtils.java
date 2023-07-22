package com.bjpowernode.common.utils;

/**
 * Package:com.bjpowernode.common.util
 * Date:2022/3/3 14:57
 */
public class CommonUtils {

    /*处理pageNo*/
    public static int defaultPageNo(Integer pageNo){
        int pNo = pageNo;
        if( pageNo == null || pageNo < 1 ){
            pNo = 1;
        }
        return pNo;
    }

    /*处理pageSize*/
    public static int defaultPageSize(Integer pageSize){
        int pSize = pageSize;
        if( pageSize == null || pageSize < 1 ){
            pSize = 1;
        }
        return pSize;
    }
}
