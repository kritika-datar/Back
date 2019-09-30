package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Answer;

@Service
public class AnswerService 
{
	@Autowired
	private AnswerRepository repository;
	
	public boolean saveAnswer(Answer ref)
	{
		boolean b = false;
		
		try
		{
			repository.save(ref);
			b = true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
	
	public List<Answer> getAllAnswersByStudent(String rollno)
	{
		List<Answer> lst = null;
		
		try 
		{
			lst = repository.findAllAnswersByStudents(rollno);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
		return lst;
	}
	
	public List<Object[]> getAllQuestionsAndAnswersByStudents()
	{
		List<Object[]> lst = null;
		
		try
		{
			lst = repository.findAllAnswers();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		return lst;
	}

}
