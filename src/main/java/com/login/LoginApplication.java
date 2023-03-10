package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LoginApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		System.out.println("Running......");
	}

	@Bean
	PasswordEncoder passwordEncoder()
	{
	return	new BCryptPasswordEncoder();
	}
}
