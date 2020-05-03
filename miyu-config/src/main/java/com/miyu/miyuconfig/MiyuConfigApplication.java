package com.miyu.miyuconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class MiyuConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiyuConfigApplication.class, args);
    }
}