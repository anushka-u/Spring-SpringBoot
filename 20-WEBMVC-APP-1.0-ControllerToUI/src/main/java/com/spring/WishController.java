package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WishController {

	
	@GetMapping("/wish")
	@ResponseBody
	public String getWishMessage() {
		String msgString = "All the best!!!";
		return msgString;
	}
}
