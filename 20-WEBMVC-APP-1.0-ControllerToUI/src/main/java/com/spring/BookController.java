package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/Book")
	public String getBookData(Model model) {
		
		//setting data to binding object
		Book bookobj = new Book(1,"Constitution of India",450.00);
//		Book bookObj2 = new Book(2,"Spring",350.00);
//		Book bookObj3 = new Book(3,"Hiberbnate",600.00);
		//adding data to model obj to send to UI
		model.addAttribute("Book",bookobj);

		
		//return view name
		return "Book";
	}
}
