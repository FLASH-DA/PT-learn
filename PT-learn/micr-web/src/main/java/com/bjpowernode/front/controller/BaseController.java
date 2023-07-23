package com.bjpowernode.front.controller;

import com.bjpowernode.service.PlatBaseInfoService;
import com.bjpowernode.service.ProductInfoService;
import org.apache.dubbo.config.annotation.DubboReference;

/**
 * Package:com.bjpowernode.front.controller
 * Date:2022/3/1 16:28
 */
public class BaseController {

    //声明公共的方法，属性的等

    @DubboReference(interfaceClass = PlatBaseInfoService.class, version = "1.0")
    protected PlatBaseInfoService platBaseInfoService;
    @DubboReference(interfaceClass = ProductInfoService.class, version = "1.0")
    protected ProductInfoService productInfoService;
}
