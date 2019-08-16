package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Product;

@Configuration
public class AppConfig {
	
	@Bean
	public Product laptop()
	{
		return new Product(101,"Dell","images/dell.jpg",3500.00D,4.2);
	}

	@Bean
	public Product mobilePhone()
	{
		return new Product(102,"Redmi","images/redmi.jpg",3500.00D,4.2);
	}

	@Bean
	public Product printer()
	{
		return new Product(103,"hp","images/hp.jpg",3500.00D,4.2);
	}

}
