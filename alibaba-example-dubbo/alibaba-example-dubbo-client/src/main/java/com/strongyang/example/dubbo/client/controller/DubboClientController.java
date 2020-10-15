package com.strongyang.example.dubbo.client.controller;

import com.strongyang.example.dubbo.comm.service.DubboCommService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yq
 * @Date 2020/10/15 16:18
 * @Description
 */
@RestController
public class DubboClientController {

    @DubboReference
    private DubboCommService dubboCommService;

    @GetMapping("/rpcTest")
    public String rpcTest() {
        return dubboCommService.rpcMethod();
    }
}
