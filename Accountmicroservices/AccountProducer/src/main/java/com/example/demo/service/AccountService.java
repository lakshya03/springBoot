package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repo;
	
	public List<Account> getAll(){
		return (List<Account>) repo.findAll();
	}
	
	 public Account add(Account acc) {
		 return repo.save(acc);
		 
	 }
	 
	 public Optional<Account> getOne(Long id)
	 {
		 return repo.findById(id);
	 }
}
