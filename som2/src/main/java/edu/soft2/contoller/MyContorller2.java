package edu.soft2.contoller;

import edu.soft2.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("param2")
public class MyContorller2 {
    @RequestMapping(value ="test3")
    public  String test3(){
        System.out.println("test()3");
        return  "hello";
    }
@RequestMapping("reg")
    public  String reg(User user){
        System.out.println("用户名"+user.getUsername());
    System.out.println("密码"+user.getPwd());
    System.out.println("年龄"+user.getAge());
        return "hello";
}
}
