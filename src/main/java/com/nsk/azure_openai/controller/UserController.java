package com.nsk.azure_openai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	//index page
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String loginAndSignup() {
		return "LoginAndSignup";
	}
	@GetMapping("/signup")
	public String Signup() {
		return "Signup";
	}
}
