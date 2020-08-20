package com.quematesuserprofleapi.dao;

import java.util.List;

import com.quematesuserprofleapi.model.User;

public interface UserDao {
	
	List<User> getAllUsers();
	
	void createuser(User user);
	
	User getUserByid(Long userid);
	

}
