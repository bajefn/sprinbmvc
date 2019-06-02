package com.bjfn.springmvc.service.impl;

import com.bjfn.springmvc.entity.User;
import com.bjfn.springmvc.mapper.UserMapper;
import com.bjfn.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
