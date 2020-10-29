package com.samjan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/10/22 14:55
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
}
