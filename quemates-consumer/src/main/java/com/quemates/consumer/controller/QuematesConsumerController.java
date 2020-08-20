package com.quemates.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.quemates.consumer.dto.UserProfileDto;

@RestController
@RequestMapping("/quemates-consmer")
public class QuematesConsumerController {
	
	@Autowired
	private LoadBalancerClient lbc;
	
	@RequestMapping("/userdata/")
	public String getUsers() {
		ServiceInstance s2=lbc.choose("QUEMATES-PRODUCER");
		String u=s2.getUri().toString();
		u=u+"/users/usr";
		System.out.println("******Url"+u);
		RestTemplate client=new RestTemplate();
		ResponseEntity<String> result=null;
		result=client.exchange(u,HttpMethod.GET,createHeader(),String.class);
		System.out.println("********Consuming the QUEMATES-PRODUCER service*****");
		System.out.println(result.getBody());
		String response = result.getBody().toString();
		return response;
		
	}

	@RequestMapping("/userprofile/test/{userid}")
	public String getUserProfile(@PathVariable("userid") Long userid) {
		ServiceInstance s2=lbc.choose("QUEMATES-PRODUCER");
		String url=s2.getUri().toString();
		url=url+"/usrprofile/usr/"+userid+"/profile";
		
		System.out.println("******Url"+url);
		RestTemplate client=new RestTemplate();
		ResponseEntity<String> result=null;
		result=client.exchange(url,HttpMethod.GET,createHeader(),String.class);
		System.out.println("********Consuming the QUEMATES-PRODUCER service*****");
		System.out.println(result.getBody());
		String response = result.getBody().toString();
		return response;
		
	}
	
	@RequestMapping("/userprofile/{userid}")
	public ResponseEntity<UserProfileDto> getUserProfileByuserId(@PathVariable("userid") Long userid) {
		ServiceInstance s2=lbc.choose("QUEMATES-PRODUCER");
		String url=s2.getUri().toString();
		url=url+"/usrprofile/usr/"+userid+"/profile";
		RestTemplate client=new RestTemplate();
		ResponseEntity<UserProfileDto> resp = client.getForEntity(url, UserProfileDto.class, userid);
		return resp;
		
		
	}
	
	private HttpEntity createHeader() {
		HttpHeaders h=new HttpHeaders();
		h.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		return new HttpEntity<>(h);
	}
	

}
