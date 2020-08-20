package com.quematesuserprofleapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quematesuserprofleapi.model.UserProfile;
import com.quematesuserprofleapi.service.UserProfileService;

@RestController
@RequestMapping("/usrprofile")
public class UserProfileController {

	@Autowired
	private UserProfileService profileService;

	@RequestMapping("/usr")
	public List<UserProfile> getAllProfiles() {
		List<UserProfile> profileList = profileService.getAllProfiles();

		System.out.println(profileList.size());
		return profileList;

	}

	@RequestMapping(value = "/usr", method = RequestMethod.POST)
	public void createUserProfile(@RequestBody UserProfile userProfile) {

		profileService.CreateUsrProfile(userProfile);
	}

	@RequestMapping("/usr/{id}")
	public UserProfile getUserProfileById(@PathVariable("id") Long id){
		UserProfile profile = profileService.getProfileById(id);
		return profile;
	}

	
	@RequestMapping("/usr/{userid}/profile")
	public UserProfile getUserProfileByUsrid(@PathVariable("userid") Long userid){
		UserProfile profile = profileService.getUserProfileByUsrid(userid);
		return profile;
	}
}
