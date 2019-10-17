package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repository;
	
	public boolean validateUser(Login ref)
	{
		boolean b = false;
		
		try 
		{
			Optional<Login> opt = repository.findById(ref.getUsername());
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return b;
	}

}
