package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg","Welcome to SpringBoot Page");
		modelAndView.setViewName("index");
		return modelAndView;
		
	}

}
