package org.lm.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@SpringBootApplication

@EnableDiscoveryClient
public class Service1Booter {
    public static void main(String[] args){
        SpringApplication.run(Service1Booter.class,args);

    }
}
