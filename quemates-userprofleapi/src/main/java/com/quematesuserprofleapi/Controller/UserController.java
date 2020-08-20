package com.quematesuserprofleapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.quematesuserprofleapi.model.User;
import com.quematesuserprofleapi.model.UserProfile;
import com.quematesuserprofleapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService usrService;
	@RequestMapping("/usr")
	public List<User> getAllUsers(){
		List<User> userList = usrService.getAllUsers();
		
		System.out.println(userList.size());
		return userList;
		
	}
	
	@RequestMapping(value="/usr", method=RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		
		usrService.createuser(user);
	}
	
	@RequestMapping("/usr/{userid}")
	@HystrixCommand(fallbackMethod = "userDefinedMethod")
	public User getUserById(@PathVariable("userid") Long userid){
		User user = usrService.getUserByid(userid);
		if(user==null) {
			throw new NullPointerException();
		}
		return user;
	}
	
	public User userDefinedMethod(Long userid) {
		User user = new User(1L,"default","default","default", "default");
		return user;
		
	}

}
