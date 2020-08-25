package com.rkcpinfo.uizuulapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rkcpinfo.uizuulapp.dto.UserProfileDto;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OAuth2RestTemplate restTemplate;

    @Value("${quemates.api:http://localhost:9092/usrprofile/usr/108/profile}")
    String quematesAPI;

    @GetMapping("/")
    public String index(Model model)
    {        
        ResponseEntity<UserProfileDto> userres = restTemplate.getForEntity(quematesAPI, UserProfileDto.class);
        UserProfileDto userProfileDto = userres.getBody();

        model.addAttribute("products", userProfileDto);

        return "index.vue";
    }
}

