package com.cloud.lan.laneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LanEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanEurekaApplication.class, args);
    }

}
