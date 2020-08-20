package com.quematesuserprofleapi.service;

import java.util.List;

import com.quematesuserprofleapi.model.User;

public interface UserService {
	
	List<User> getAllUsers();

	void createuser(User user);

	User getUserByid(Long userid);

}
