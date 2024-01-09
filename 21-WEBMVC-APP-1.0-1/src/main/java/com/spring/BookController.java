package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {

	@GetMapping("/books")
	public String getBookData(Model model) {
		Book b1= new Book(1,"Spring",450.00);
		Book b2 = new Book(2,"Kubernate",420.00);
		Book b3 = new Book(3,"Java",680.00);
		
		List<Book> bookList = Arrays.asList(b1,b2,b3);
		model.addAttribute("books",bookList);
		return "books";
		 
		
	}
}
