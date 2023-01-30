package com.cab.cloud.nacos.server.service;


import com.cab.cloud.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "hello-server")
public interface HelloService {

    @GetMapping("/hello")
    Result hello();
}
