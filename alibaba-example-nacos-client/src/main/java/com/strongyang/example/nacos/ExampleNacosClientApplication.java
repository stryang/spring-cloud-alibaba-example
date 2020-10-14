package com.strongyang.example.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Author     ：yq
 * @ Date       ：Created in 13:42 2020/10/14
 * @ Description：nacos服务发现客户端启动类
 */
@Slf4j
@EnableDiscoveryClient
@SpringCloudApplication
public class ExampleNacosClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleNacosClientApplication.class, args);
        System.out.println("###############finish.################");
    }
}
