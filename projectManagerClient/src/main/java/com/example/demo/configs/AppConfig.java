package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clients.ProductClient;
import com.example.demo.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public ProductClient client() {
		return new ProductClient();
	}
	@Bean
	public Product product() {
	return new Product(109,"proi","ipofcn",3400,3.4);
	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
