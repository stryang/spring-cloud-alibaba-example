package com.strongyang.example.dubbo.server.service;

import com.strongyang.example.dubbo.comm.service.DubboCommService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author yq
 * @Date 2020/10/15 15:38
 * @Description
 */
@DubboService
public class DubboServiceImpl implements DubboCommService{

    public String rpcMethod() {
        return "dubbo rpc return!";
    }
}
