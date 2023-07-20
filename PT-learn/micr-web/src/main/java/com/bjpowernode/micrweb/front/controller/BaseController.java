package com.bjpowernode.micrweb.front.controller;
import com.bjpowernode.service.platBaseInfoService;
import org.apache.dubbo.config.annotation.DubboReference;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BaseController {
    @DubboReference(interfaceClass = com.bjpowernode.service.platBaseInfoService.class,version = "1.0")
    protected platBaseInfoService platBaseInfoService;



}
