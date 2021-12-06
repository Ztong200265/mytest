package edu.soft2.contoller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class IndexController {
    @RequestMapping(value = "/sayHello")
    public  String sayHello(){
        System.out.println("hello springmvc!!");
        return  "success";
    }

    @RequestMapping("/Hi")
    public  String sayHi(HttpRequest request){
        System.out.println("--sayHi--");
        return "Hi";
    }
}
