package com.strongyang.example.seata.business;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yq
 * @Date 2020/10/19 16:00
 * @Description
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringCloudApplication
public class ExampleSeataBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleSeataBusinessApplication.class, args);
        System.out.println("###############finish.################");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
