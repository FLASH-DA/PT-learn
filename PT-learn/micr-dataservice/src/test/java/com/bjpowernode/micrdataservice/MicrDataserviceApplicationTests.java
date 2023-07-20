package com.bjpowernode.micrdataservice;

import com.bjpowernode.pojo.BaseInfo;
import com.bjpowernode.service.PlatBaseInfoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicrDataserviceApplicationTests {
    @DubboReference(interfaceClass = PlatBaseInfoService.class,version = "1.0")
    PlatBaseInfoService platBaseInfoService;
    @Test
    void contextLoads() {
        BaseInfo baseInfo = platBaseInfoService.queryPlatBaseInfo();
        System.out.println(baseInfo);
    }

}
