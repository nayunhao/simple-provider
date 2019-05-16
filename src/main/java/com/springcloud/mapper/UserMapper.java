package com.springcloud.mapper;

import java.util.List;

import com.springcloud.enitity.User;

public interface UserMapper {
   List<User> findAll();
   Integer insertOne(User user);
}
