package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	
	@Bean
	@Lazy
	// AFTER USING THIS THE BEAN IS NOT INIALIZE EVERYTIME
	public Doctor doctor()
	{
		Doctor ramesh=new Doctor();
		ramesh.setDoctorId(10);
		ramesh.setDoctorName("Ramesh");
		ramesh.setPhoneNumber(946789);
		ramesh.setAddress(address());
		return ramesh;
	}
	
	@Bean
	public Doctor surgeon()
	{
		Doctor suresh=new Doctor();
		suresh.setDoctorId(10);
		suresh.setDoctorName("Suresh");
		suresh.setPhoneNumber(946789);
		return suresh;
	}
	@Bean
 public  Address address() {
	 return new Address("Gandhi Street","Chennai",690978);
 }
}
