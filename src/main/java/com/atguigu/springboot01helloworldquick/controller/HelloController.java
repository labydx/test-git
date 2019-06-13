package com.atguigu.springboot01helloworldquick.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
    @RequestMapping("/world")
    public String world(){
        return "world to live";
    }

}
