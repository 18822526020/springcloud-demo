package com.cab.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Server8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Server8002Application.class, args);
    }
}
