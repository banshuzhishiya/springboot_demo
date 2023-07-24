package com.example.springboot_demo.service;

import com.example.springboot_demo.bean.User;
public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User loginIn(String name, String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
