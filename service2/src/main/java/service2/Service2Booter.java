package service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import service2.service.RemoteService1;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@SpringBootApplication
@EnableDiscoveryClient()
@EnableFeignClients(basePackageClasses = Service2Booter.class)
public class Service2Booter {
    public static void main(String[] args){
        SpringApplication.run(Service2Booter.class,args);

    }
}
