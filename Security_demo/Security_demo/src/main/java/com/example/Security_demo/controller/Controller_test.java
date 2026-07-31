package com.example.Security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_test {

	@GetMapping("/a")
	public String msg() {
		return "welcome to security classes";
	}	
	
	@GetMapping("/public")
	public String user() {
		return "this method is public to view";
	
	}
	@GetMapping("/private")
	public String admin() {
		return "this page is private";
	}
	
	@GetMapping("/admin")
	public String Admin() {
		return "Admin login";
	}
	
	@GetMapping("/user")
	public String User() {
		return "User login";
	}
}
