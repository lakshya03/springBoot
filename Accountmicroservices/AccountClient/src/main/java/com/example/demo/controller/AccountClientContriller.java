package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	@GetMapping("/find/{id}")
	public String getHotels(@PathVariable("id") Long id)
	{
		ServiceInstance serviceInstance=client.choose("call-account-provider");

				String baseUrl=serviceInstance.getUri().toString();

				String updateUrl = baseUrl+"/find/"+id;

				String response = template.getForObject(updateUrl,String.class);

				return response;
	}
	
//	@PostMapping("/add}")
//	public String addHotels(@RequestBody String hotel)
//	{
//		ObjectMapper mapper = new ObjectMapper();
//		
//		mapper.
//		(hotel,Object.class)
//		ServiceInstance serviceInstance=client.choose("call-account-provider");
//
//				String baseUrl=serviceInstance.getUri().toString();
//
//				String updateUrl = baseUrl+"/find/"+id;
//
//				String response = template.getForObject(updateUrl,String.class);
//
//				return response;
//	}
	
}
