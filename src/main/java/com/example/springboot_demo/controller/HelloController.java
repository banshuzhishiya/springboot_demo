package com.example.springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayIndex(){
        return "index";
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "sayHello";
    }
}
