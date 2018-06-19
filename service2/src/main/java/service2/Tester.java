package service2;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.converters.Auto;
import javafx.application.Application;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service2.service.RemoteService1;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
public class Tester {
    @Autowired
    private RemoteService1 remoteService1;
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/remote")
    @ResponseBody
    public Object test() {
//        List<ServiceInstance> list = discoveryClient.getInstances("service1");
//        return list;
        return remoteService1.getUserName("lm");
    }

    @GetMapping("/beans")
    public  Object getAllBeans(){
       return applicationContext.getBeanDefinitionNames();
    }



}
