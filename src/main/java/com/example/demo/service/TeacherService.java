package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Teacher;

@Service
public class TeacherService
{
	@Autowired
	private TeacherRepository repository;
	
	public boolean validateTeacher(Teacher ref)
	{
		boolean b = false;
		
		try 
		{
			Optional<Teacher> opt = repository.findById(ref.getTeacherid());
			
			if(opt.isPresent())
			{
				Teacher teach = opt.get();
//				if(teach.getUsername().equals(ref.getUsername()))
//				{
//					if(teach.getPassword().equals(ref.getPassword()))
//						b = true;
//				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
	
	public boolean changePassword(Teacher ref, String newpass)
	{
		boolean b = false;
		
		try 
		{
//			Teacher teach = repository.findTeacherByUsernameAndPassword(ref.getUsername(), ref.getPassword());
//			if(teach!=null)
//			{
//				int n = repository.updateTeacherPassword(ref.getPassword(), newpass);
//				if(n>0)
//					b = true;
//			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
	
	public boolean uploadQuestions()
	{
		boolean b = false;
		
		return b;
	}

}