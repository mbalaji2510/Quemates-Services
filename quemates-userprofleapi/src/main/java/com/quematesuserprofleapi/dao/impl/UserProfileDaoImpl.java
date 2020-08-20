package com.quematesuserprofleapi.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.quematesuserprofleapi.dao.UserProfileDao;
import com.quematesuserprofleapi.model.UserProfile;
@Repository
public class UserProfileDaoImpl implements UserProfileDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<UserProfile> getAllProfiles() {
		
		Query query = em.createQuery("select  u  from UserProfile u");
		List<UserProfile> usrProfileList = query.getResultList();
		
		return usrProfileList;
	}

	@Override
	public void CreateUsrProfile(UserProfile userProfile) {
		em.persist(userProfile);
		em.flush();
		
	}

	@Override
	public UserProfile getProfileById(Long id) {
		// TODO Auto-generated method stub
		UserProfile userProfile = em.find(UserProfile.class, id);
		return userProfile;
	}

	@Override
	public UserProfile getUserProfileByUsrid(Long userid) {
		TypedQuery<UserProfile> query = em.createQuery(
				  "SELECT u FROM UserProfile u WHERE u.user.userid = :userid" , UserProfile.class);
		System.out.println("query executed successfully");
		UserProfile profile = query.setParameter("userid", userid).getSingleResult();
		
		return profile;

	}

}
