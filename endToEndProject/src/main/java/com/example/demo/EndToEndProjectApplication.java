package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled =true)
public class EndToEndProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndToEndProjectApplication.class, args);
	}

}
