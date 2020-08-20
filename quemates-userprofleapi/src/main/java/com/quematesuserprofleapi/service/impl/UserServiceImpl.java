package com.quematesuserprofleapi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quematesuserprofleapi.dao.UserDao;
import com.quematesuserprofleapi.model.User;
import com.quematesuserprofleapi.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public void createuser(User user) {
		userDao.createuser(user);
		
	}

	@Override
	public User getUserByid(Long userid) {
		
		return userDao.getUserByid(userid);
	}

}
