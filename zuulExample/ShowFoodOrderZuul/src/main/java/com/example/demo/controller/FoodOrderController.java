package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {
	@GetMapping("/getPastFoodOrder")
	public String getPastFoodOrder() {
		
		return "spring roll";
	}
	
	@GetMapping("/getUpcomingFoodOrder")
public String upCopmingFoodOrder() {
		
		return "pizza";
	}


}
