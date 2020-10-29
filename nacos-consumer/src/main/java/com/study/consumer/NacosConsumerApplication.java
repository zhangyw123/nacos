package com.study.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/9/10 11:39
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@Slf4j
@RequestMapping("/consumer")
public class NacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        log.info("I'm calling nacos-consumer service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-consumer";
    }
}
