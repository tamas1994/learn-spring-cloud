package com.folkcat.consulmiya;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tamas on 2017/12/27.
 * TODO NOTE consul agent -dev 先启动consul
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulMiyaApplication {

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulMiyaApplication.class).web(true).run(args);
    }
}