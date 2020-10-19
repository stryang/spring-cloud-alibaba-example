package com.strongyang.example.seata.business.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author yq
 * @Date 2020/10/19 16:00
 * @Description
 */
@FeignClient("example-seata-order-service")
public interface OrderService {

    @PostMapping(path = "/order")
    String order(@RequestParam("userId") String userId,
                 @RequestParam("commodityCode") String commodityCode,
                 @RequestParam("orderCount") int orderCount);

}
