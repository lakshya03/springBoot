package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService service;
	
	@GetMapping("/payments")
	public List<Payment> getAll()
	{
		 return (List<Payment>) this.service.findAll();
		 
	}
	@PostMapping(value="/payments",consumes="application/json",produces="application/json")
	public Payment add(@RequestBody Payment entity)
	{
		
	return this.service.save(entity);
	}

}
