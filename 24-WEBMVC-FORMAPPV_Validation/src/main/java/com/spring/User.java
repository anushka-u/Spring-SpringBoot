package com.spring;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	
	@NotEmpty(message = "User Name is mandatory")
	@Size(min=3, max=80, message="Should be in between 3 to 80 chars")
	private String userName;
	
	@NotEmpty(message = "Setting a Password is required")
	private String password;
	
	@NotEmpty(message = "Email cannot be empty")
	@Email(message = "enter valid Email Id")
	private String email;
	
	@NotEmpty(message = "Can not be left empty")
	@Size(min=10, message = "Length should be 10")
	private String phNumber;
	
	
	@NotNull(message="Age is required")
	@Min(value = 18, message = "The minimum age allowed is 18")
	@Max(value = 60, message = "The minaximum age allowed is 60")
	private Integer age;
}
