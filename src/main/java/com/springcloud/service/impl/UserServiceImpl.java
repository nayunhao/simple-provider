package com.springcloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springcloud.enitity.User;
import com.springcloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	public List<User> getAllUser() {
		User user = new User();
		user.setId(1);
		user.setName("nayunhao");
		user.setAge(28);
		List<User> list = new ArrayList<User>();
		list.add(user);
		return list;
	}

	public User addUser(User user) {
		System.out.println("插入数据开始。。。");
		return user;
	}

}
