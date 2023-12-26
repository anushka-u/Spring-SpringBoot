package com.spring;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser() throws Exception {
		
		String image_PathString = "C:\\img.jpg";
		User user = new User();
		user.setUserEmail("ramya@gmail.com");
		user.setUserName("Ramya");
		
		long size = Files.size(Paths.get(image_PathString));
		byte[] arr = new byte[(int)size];
		FileInputStream fiStream =  new FileInputStream(new File(image_PathString));
		fiStream.read(arr);
		fiStream.close();
		
		user.setUserImage(arr);
		
		userRepository.save(user);
	}
	
}
