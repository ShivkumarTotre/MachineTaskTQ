package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Demo")
public class WelcomeController {

	@RequestMapping("/getM")
	public int firstMethod()
	{
		int id = 5;
		
		return id;
	}
	
	@RequestMapping("/getS")
	public int secondMethod()
	{
		int iSum = 11 + 6;
		
		return iSum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/getMe")
//	public String welcome() {
//		return "Hello World";
//	}
}
