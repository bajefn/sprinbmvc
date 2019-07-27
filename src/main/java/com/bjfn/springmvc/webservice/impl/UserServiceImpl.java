package com.bjfn.springmvc.webservice.impl;

import com.bjfn.springmvc.entity.User;
import com.bjfn.springmvc.mapper.UserMapper;
import com.bjfn.springmvc.webservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }

    @Override
    public List<User> findAll() {
        return userMapper.getAllUser();
    }
}
