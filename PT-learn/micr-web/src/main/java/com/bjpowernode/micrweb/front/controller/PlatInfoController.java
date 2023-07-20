package com.bjpowernode.micrweb.front.controller;

import com.bjpowernode.pojo.BaseInfo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
@RestController
public class PlatInfoController extends BaseController {
    /**
     * 平台基本信息
     */
    public void queryPaltBaseInfo(){
        BaseInfo baseInfo = platBaseInfoService.queryPlatBaseInfo();

    }
}
