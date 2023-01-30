package com.cab.cloud.nacos.server.controller;


import com.cab.cloud.common.entity.Result;
import com.cab.cloud.nacos.server.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public Result hello() {
        return helloService.hello();
    }
}
