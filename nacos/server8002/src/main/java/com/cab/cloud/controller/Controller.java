package com.cab.cloud.controller;


import com.cab.cloud.common.entity.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public Result hello() {
        return Result.success(port);
    }
}
