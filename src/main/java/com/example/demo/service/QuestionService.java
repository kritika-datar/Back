package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Question;

@Service
public class QuestionService 
{
	@Autowired
	private QuestionRepository repository;
	
	public boolean saveQuestion(Question ref)
	{
		boolean b = false;
		
		try
		{
			repository.save(ref);
			b = true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
	
	public boolean deleteQuestion(Question ref)
	{
		boolean b = false;
		
		try 
		{
			Optional<Question> opt = repository.findById(ref.getQuestionid());
			
			if(opt.isPresent())
			{
				repository.delete(ref);
				b = true;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return b;
	}
	
	public boolean updateQuestion(Question ref)
	{
		boolean b = false;
		
		try
		{
			Optional<Question> opt = repository.findById(ref.getQuestionid());
			
			if(opt.isPresent())
			{
				repository.save(ref);
				b = true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return b;
	}
	
	public List<Question> getAllQuestions()
	{
		List<Question> lst = new ArrayList<Question>();
		
		try 
		{
			repository.findAll().forEach(lst::add);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return lst;
	}
}
