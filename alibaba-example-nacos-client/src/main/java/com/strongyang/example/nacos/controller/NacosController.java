package com.strongyang.example.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author     ：yq
 * @ Date       ：Created in 14:23 2020/10/14
 * @ Description：
 */
@RefreshScope
@RestController
public class NacosController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${spring.config-test}")
    private String configTest;

    @GetMapping("/getServiceList")
    public List<ServiceInstance> getServiceList() {
        return discoveryClient.getInstances("example-nacos-client");
    }

    @GetMapping("/configTest")
    public String configTest() {
        return configTest;
    }
}
