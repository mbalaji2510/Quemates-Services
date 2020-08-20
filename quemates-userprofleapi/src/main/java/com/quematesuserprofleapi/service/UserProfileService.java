package com.quematesuserprofleapi.service;

import java.util.List;

import com.quematesuserprofleapi.model.UserProfile;

public interface UserProfileService {
	
	List<UserProfile> getAllProfiles();
	
	void CreateUsrProfile(UserProfile userProfile);
	
	UserProfile getProfileById(Long id);
	
	UserProfile getUserProfileByUsrid(Long userid);
	

}
