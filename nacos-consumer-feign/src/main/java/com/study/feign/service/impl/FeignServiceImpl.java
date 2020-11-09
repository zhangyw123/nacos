package com.study.feign.service.impl;

import com.study.feign.service.IFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/11/7 15:22
 **/
@Component
@Slf4j
public class FeignServiceImpl implements IFeignService {

    //private Throwable cause;
    @Override
    public String hello() {
        return "请求超时";
    }

//    public Throwable getCause() {
//        return cause;
//    }
//
//    public void setCause(Throwable cause) {
//        this.cause = cause;
//    }
}
