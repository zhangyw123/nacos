package com.study.rbac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/10/28 10:38
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "";
    }
}
