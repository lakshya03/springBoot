package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripDetailController {
	
	@GetMapping("/getPastTrip")
	public String getPastTrips() {
		
		return "ch-89-ch-78,ch-09-ch-12";
	}
	
	@GetMapping("/getUpcomingTrip")
public String upCopmingTrips() {
		
		return "ch-177-to-ch-798";
	}

}
