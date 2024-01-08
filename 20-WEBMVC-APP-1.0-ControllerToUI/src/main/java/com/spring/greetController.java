package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greetController {

	@GetMapping("/greet")
	public String getGreetMessage(Model model) {
		String msgString = "Good Morning!";
		model.addAttribute("msg",msgString);
		return "greet";
	}
}
