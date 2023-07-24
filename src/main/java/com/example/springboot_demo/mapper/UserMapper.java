package com.example.springboot_demo.mapper;

import com.example.springboot_demo.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User getInfo(String name, String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}