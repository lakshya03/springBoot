package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Generated;

@RestController
public class CabDriverController {
	@GetMapping("/drivers")
	public String getDriver() {
		return "Manas-9820567";
	}

}
