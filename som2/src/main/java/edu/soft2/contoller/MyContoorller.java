package edu.soft2.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyContoorller {
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String hello(HttpServletRequest request) {
        System.out.println("----hello()----");
         String name=request.getParameter("name");
         System.out.println("name"+name);
           return "hello";
        }
        @RequestMapping(value = "param1",method = {RequestMethod.GET,RequestMethod.POST})
    public  String param1(HttpServletRequest request){
        System.out.println("-----param1()----");
        String username=request.getParameter("username");
        String age =request.getParameter("age");
        System.out.println("username="+username+"age="+age);
        request.setAttribute("username",username);
        request.setAttribute("age",age);
        return "redirect:hello";

        }
    @RequestMapping(value = "param3",method = {RequestMethod.GET,RequestMethod.POST})
    public  String param3(HttpServletRequest request, HttpSession session){
        System.out.println("-----param3()----");
        String username=request.getParameter("username");
        String age =request.getParameter("age");
        System.out.println("username="+username+"age="+age);
        request.setAttribute("username",username);
        request.setAttribute("age",age);
        return "redirect:hello";

    }
    @RequestMapping(value = "param4",method = {RequestMethod.GET,RequestMethod.POST})
    public  String param4(String  username,int age){
//        System.out.println("-----param3()----");
//        String username=request.getParameter("username");
//        String age =request.getParameter("age");
//        System.out.println("username="+username+"age="+age);
//        request.setAttribute("username",username);
//        request.setAttribute("age",age);
        System.out.println("username"+username+"age"+age);
        return "redirect:hello";

    }

    }
