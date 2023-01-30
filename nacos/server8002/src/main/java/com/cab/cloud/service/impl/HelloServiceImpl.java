package com.cab.cloud.service.impl;


import com.cab.cloud.common.entity.Result;
import com.cab.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    private String port;


    @Override
    public Result hello() {
        return Result.success(port);
    }

}
