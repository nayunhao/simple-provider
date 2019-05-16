package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.enitity.User;
import com.springcloud.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;
  
  @RequestMapping(value="/getusers", method = RequestMethod.POST)
  @ResponseBody
  public List<User> getUsers(){
	return userService.getAllUser();
  }
  
  @RequestMapping(value="/adduser", method = RequestMethod.POST)
  @ResponseBody
  public User addUser(@RequestBody User user) {
	  return userService.addUser(user);
  }
  
}
