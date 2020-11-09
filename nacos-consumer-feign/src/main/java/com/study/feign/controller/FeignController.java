package com.study.feign.controller;

import com.study.feign.service.IFeignService;
import com.study.feign.service.impl.FeignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/11/7 14:58
 **/
@RestController
public class FeignController {

    @Autowired
    private IFeignService feignService;

    @RequestMapping("/feignTest")
    public String feignTest(){
        return feignService.hello();
    }
}
