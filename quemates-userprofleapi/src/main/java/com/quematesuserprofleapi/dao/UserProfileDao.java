package com.quematesuserprofleapi.dao;

import java.util.List;

import com.quematesuserprofleapi.model.UserProfile;

public interface UserProfileDao {
	
List<UserProfile> getAllProfiles();
	
	void CreateUsrProfile(UserProfile userProfile);
	
	UserProfile getProfileById(Long id);
	UserProfile getUserProfileByUsrid(Long userid);

}
