package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String getUserFormData(Model model)
	{
		User userObj=new User();
		model.addAttribute("user",userObj);
		
		return "index";
	}
	
	@PostMapping("/user")
	public String handleFormSubmission(User user, Model model)
	{
		System.out.println(user);
		model.addAttribute("msg","Thanks, Details Saved Successfully!!");
		return "success";
	}
}
