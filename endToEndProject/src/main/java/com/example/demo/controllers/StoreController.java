package com.example.demo.controllers;

import java.util.List;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Store;
import com.example.demo.services.StoreService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class StoreController {

	@Autowired
	private StoreService repo;
	
	@ApiOperation(value="Fetch the Details of all golbal")
	@ApiResponses({
		@ApiResponse(code=200,message = "resource Found")
	})
	@GetMapping("/allStores")
	@Secured("ROLE_USER")
	@PermitAll
	public List<Store> getStores(){
		return this.repo.getAll();
	}
	
	@ApiOperation(value="Takes the stoe id in 6 digit")
	@GetMapping("/allStores/{storeId}")
	public Store findStoreById(long id)
	{
		return this.repo.findById(id);
	}
	
	@GetMapping("/message")
	public String getSalary() {
		return "i am unsecured";
	}
}
