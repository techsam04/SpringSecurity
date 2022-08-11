package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/123")
	public String hello() {
		return "<h1>Helllo World!!</h1>";
	}
	

}
