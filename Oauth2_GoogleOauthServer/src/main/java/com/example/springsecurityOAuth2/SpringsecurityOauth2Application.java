package com.example.springsecurityOAuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//spring boot application will work as both the client and resource server
//authorization server will be github

@SpringBootApplication
public class SpringsecurityOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityOauth2Application.class, args);
	}

}
