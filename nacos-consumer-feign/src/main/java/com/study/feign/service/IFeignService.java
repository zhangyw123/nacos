package com.study.feign.service;

//import com.study.feign.service.fallback.FeignFallbackFactory;
import com.study.feign.service.impl.FeignServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/11/7 14:20
 **/

@FeignClient(value = "nacos-provide",fallback = FeignServiceImpl.class)
public interface IFeignService {

    @GetMapping("/provide/hello")
    public String hello();
}
