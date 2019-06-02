package com.bjfn.springmvc.mapper;

import com.bjfn.springmvc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
