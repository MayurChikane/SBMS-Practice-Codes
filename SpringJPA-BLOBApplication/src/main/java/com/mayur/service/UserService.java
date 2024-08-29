package com.mayur.service;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayur.entity.User;
import com.mayur.repository.UserRepository;

@Service 
public class UserService {
	@Autowired
	private UserRepository u;
	
	public void saveUser() throws Exception
	{
		User user =new User();
		
//		String imgpath="C:\\Users\\mayur\\OneDrive\\Documents\\bird.jpeg";

		user.setUsername("Mayur");
		user.setUseremail("mayurchikan123@gmail.com");
//
//		FileInputStream fis=new FileInputStream(imgpath);
//		long l=Files.size(Paths.get(imgpath));
//		byte[] b=new byte[(int)l];
//		fis.read(b);
//		fis.close();
		
//		user.setUserimage(b);
		u.save(user);
	}
}
