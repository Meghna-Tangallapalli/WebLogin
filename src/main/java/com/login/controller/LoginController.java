package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.entity.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/loginPage")
	public String loginPage(Model model) {
		LoginForm loginForm = new LoginForm();
		model.addAttribute("login", loginForm);
		return "index";
		
	}
	
	@PostMapping("/checkLogin")
	public String checkLogin(LoginForm loginObj, Model model) {
		if (loginObj.getEmail().equals("meghna@gmail.com") && loginObj.getPassword().equals("meghna123")) {
			model.addAttribute("msg", "Welcome to gmail");
			return "dashboard";
			
		}else {
			model.addAttribute("invalid", "Invalid Credentials");
			return "index";
		}
		
		
	}

}
