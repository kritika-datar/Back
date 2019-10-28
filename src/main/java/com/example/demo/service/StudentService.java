package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Student;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository repository;
	
	public boolean validateStudent(Student ref)
	{
		boolean b = false;
		
		try 
		{
			Optional<Student> opt = repository.findById(ref.getStudentid());
			
			if(opt.isPresent())
			{
				Student stud = opt.get();
//				if(stud.getStudusername().equals(ref.getStudusername()))
//				{
//					if(stud.getStudpassword().equals(ref.getStudpassword()))
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
	
	public boolean changePassword(Student ref, String newpass)
	{
		boolean b = false;
		
		try 
		{
//			Student stud = repository.findStudentByUsernameAndPassword(ref.getStudusername(), ref.getStudpassword());
//			if(stud!=null)
//			{
//				int n = repository.updateStudentPassword(ref.getStudusername(), newpass);
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
}
