package org.lm.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
public class UserService {

    @RequestMapping("/test2")
    public String test(String name){
        return "HI ,"+name;

    }
}
