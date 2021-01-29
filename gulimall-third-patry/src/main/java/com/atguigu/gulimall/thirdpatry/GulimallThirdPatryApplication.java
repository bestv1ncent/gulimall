package com.atguigu.gulimall.thirdpatry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallThirdPatryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallThirdPatryApplication.class, args);
    }

}
