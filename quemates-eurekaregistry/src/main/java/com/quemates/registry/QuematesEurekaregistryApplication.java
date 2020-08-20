package com.quemates.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuematesEurekaregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuematesEurekaregistryApplication.class, args);
	}

}
