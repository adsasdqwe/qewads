package com.example.seoulCityAir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class seoulCitiAirController {

	
	@GetMapping("/")
	public String Main() {
		return "templates/main";
	}
	
}
