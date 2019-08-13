package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService service;
	
	@GetMapping("/find")
	public List<Account> getAccountAll()
	{
	 return service.getAll();	
	}
	
	@PostMapping(value="/find",produces = "application/json",consumes = "application/json")
	public Account addAccount(@RequestBody Account acc)
	{
		return service.add(acc);
	}

}
