package com.quemates.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
		RestTemplate client=new RestTemplate();
		ResponseEntity<String> result=null;
		result=client.exchange(u,HttpMethod.GET,createHeader(),String.class);
		System.out.println("********Consuming the QUEMATES-PRODUCER service*****");
		System.out.println(result.getBody());
		String response = result.getBody().toString();
		return response;
		
	}

	private HttpEntity createHeader() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
