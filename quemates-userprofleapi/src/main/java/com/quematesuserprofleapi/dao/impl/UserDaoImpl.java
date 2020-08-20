package com.quematesuserprofleapi.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.quematesuserprofleapi.dao.UserDao;
import com.quematesuserprofleapi.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<User> getAllUsers() {
		Query query = em.createQuery("select  u  from User u");
		List<User> userList = query.getResultList();
		
		return userList;
	}

	@Override
	public void createuser(User user) {
		em.persist(user);
		
	}

	@Override
	public User getUserByid(Long userid) {
		User usr = em.find(User.class, userid);
		return usr;
	}

}
