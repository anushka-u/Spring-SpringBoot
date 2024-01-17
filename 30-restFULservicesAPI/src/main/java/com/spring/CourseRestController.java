package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public String getCourseFee(String cName, String tName)
	{
		String resBodyString = cName + " By " +tName +" Fee is 7000";
		
		return resBodyString;
	}
}
