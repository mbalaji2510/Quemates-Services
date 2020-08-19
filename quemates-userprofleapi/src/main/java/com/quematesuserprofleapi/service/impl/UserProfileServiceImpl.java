package com.quematesuserprofleapi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quematesuserprofleapi.dao.UserProfileDao;
import com.quematesuserprofleapi.model.UserProfile;
import com.quematesuserprofleapi.service.UserProfileService;

@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired
	private UserProfileDao userProfileDao;

	@Override
	public List<UserProfile> getAllProfiles() {
		// TODO Auto-generated method stub
		return userProfileDao.getAllProfiles();
	}

	@Override
	public void CreateUsrProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		userProfileDao.CreateUsrProfile(userProfile);
		
	}

	@Override
	public UserProfile getProfileByUserId(Long userId) {
		// TODO Auto-generated method stub
		return userProfileDao.getProfileByUserId(userId);
	}

}
