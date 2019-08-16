package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.filter.MyPostFilter;
import com.example.demo.filter.MypreFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MyZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulProxyApplication.class, args);
	}

	@Bean
	public MyPostFilter post()
	{
		return new MyPostFilter();
	}
	@Bean
	public MypreFilter pre()
	{
		return new MypreFilter();
	}
}
