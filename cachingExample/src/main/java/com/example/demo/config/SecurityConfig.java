package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		auto form
//		http.rememberMe().key("my-remember-key").tokenValiditySeconds(3000).
//		rememberMeParameter("remember-me").
//		and().
//		authorizeRequests().anyRequest().authenticated().
//		and().formLogin();
		
//		custom  form
		http.authorizeRequests().antMatchers("/find/**").authenticated().and().formLogin().loginPage("/login");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}ramesh").roles("USER");
	}
	

}
