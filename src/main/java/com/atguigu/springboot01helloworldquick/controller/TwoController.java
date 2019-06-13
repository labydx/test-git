package com.atguigu.springboot01helloworldquick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
    @RequestMapping("/two")
    public String saiTo(){
        return "goto thte world";
    }
}
