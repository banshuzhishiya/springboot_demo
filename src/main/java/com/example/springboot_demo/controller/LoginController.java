package com.example.springboot_demo.controller;

import com.example.springboot_demo.bean.User;
import com.example.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password){
        User user = userService.loginIn(name, password);
        if(user!=null){
            return "success";
        }
        else {
            return "fail";
        }

    }


}
