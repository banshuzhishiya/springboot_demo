package com.example.springboot_demo;

import com.example.springboot_demo.bean.User;
import com.example.springboot_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.Provider;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    <UserBean>
    void contextLoads() {
        User userBean = (User) userService.selectByPrimaryKey(1);
        System.out.println("用户名为："+userBean.getName());
        System.out.println("密码为："+userBean.getPassword());
    }

}
