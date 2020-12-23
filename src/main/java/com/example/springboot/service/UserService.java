package com.example.springboot.service;

import java.util.List;


import com.example.springboot.model.User;
import com.example.springboot.model.UserInfo;

public interface UserService {
	

	public List<User> getAllUsers();

	public User getUser(int userId);

	public User insertUser(User user);

	public User updateUser(User user);

	public String deleteUser(int userId);

	public UserInfo authInfo(String mobile,String password );

	
	public User getUserByName(String name);
	
	public User getUserByMobile(String mobile);
}
