package com.springcloud.service;

import java.util.List;

import com.springcloud.enitity.User;

public interface UserService {
  public List<User> getAllUser();
  public User addUser(User user);
}
