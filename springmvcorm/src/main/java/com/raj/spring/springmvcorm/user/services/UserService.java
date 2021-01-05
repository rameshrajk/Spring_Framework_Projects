package com.raj.spring.springmvcorm.user.services;

import java.util.List;

import com.raj.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
}
