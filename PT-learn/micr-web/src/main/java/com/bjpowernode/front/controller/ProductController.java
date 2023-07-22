package com.bjpowernode.front.controller;

import com.bjpowernode.front.view.RespResult;
import com.bjpowernode.pojo.MultiProduct;
import com.bjpowernode.service.ProductInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/v1")
public class ProductController extends BaseController{
    @Resource
    @GetMapping("/product/v1")
    public RespResult queryProductIndex(){
        RespResult result = new RespResult();
        MultiProduct multiProduct= productInfoService.queryIndexPageProducts();
        result.setData(multiProduct);
        return result;
    }

}
