package service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
public class UserService {

    @GetMapping("/test")
    public String test(String name){
        return "HI ,"+name;

    }
}
