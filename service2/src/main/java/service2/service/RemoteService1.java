package service2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@FeignClient(value = "service1")
public interface RemoteService1 {

    @RequestMapping(path = "/test2",method = RequestMethod.GET)
    public String getUserName(@RequestParam("name") String name);
}
