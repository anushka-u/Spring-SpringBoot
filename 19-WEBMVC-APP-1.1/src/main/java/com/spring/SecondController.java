package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/wish")
	public ModelAndView getWishMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","All the Best!");
		modelAndView.setViewName("wish");
		return modelAndView;
	}

}
