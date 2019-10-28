package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repository;
	
	public Login validateUser(String username, String password)
	{
//		boolean b = true;
		
		Login log = null;
		
		try 
		{
			Optional<Login> opt = repository.findByUsernameAndPassword(username, password);
			
			if(opt.isPresent())
			{
				log = opt.get();
				return log;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return log;
	}

}
