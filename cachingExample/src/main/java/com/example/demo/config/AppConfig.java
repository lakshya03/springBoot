package com.example.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Payment;

@Configuration
@EnableCaching
public class AppConfig {

	@Bean
	public Payment ram() {
		return new Payment(202,"ram",4500);
	}
	@Bean
	public Payment raj() {
		return new Payment(206,"raj",4500);
	}
	@Bean
	public Payment ramesh() {
		return new Payment(209,"ramesh",4500);
	}
}
