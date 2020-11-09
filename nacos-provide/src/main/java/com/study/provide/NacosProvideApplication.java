package com.study.provide;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/9/10 11:39
 **/
@RestController
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class NacosProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvideApplication.class, args);
    }
    @GetMapping("/hello")
    public String sayHello(){
        log.info("I'm calling nacos-provider service by dynamic gateway...");
        return  " Hi~, I'm from nacos-provider";
    }
}
