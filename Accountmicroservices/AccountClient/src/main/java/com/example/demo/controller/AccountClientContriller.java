package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountClientContriller {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient client;
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@GetMapping("/find")
	public String getAccount()
	{
		ServiceInstance serviceInstance=client.choose("call-account-provider");
		String baseURL = serviceInstance.getUri().toString();
		baseURL = baseURL + "/find";
		String response = template.getForObject(baseURL,String.class);
		return response;
		
	}
}
