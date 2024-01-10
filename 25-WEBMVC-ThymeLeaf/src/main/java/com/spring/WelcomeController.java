package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String getWelcome(Model model)
	{
		model.addAttribute("msg","Welcome to Thymeleaf World!!!");
		
		return "index";
	}
}
