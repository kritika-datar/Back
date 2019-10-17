package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Exam;
import com.example.demo.dto.Student;

@Service
public class ExamService
{
	@Autowired
	private ExamRepository examRepository;
	
	public boolean saveExam(Exam ref)
	{
		boolean b = false;
		
		try 
		{
			examRepository.save(ref);
			b = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
	
	public List<Exam> showExamsForStudent(Student ref)
	{
		List<Exam> lst = null;
		
		try 
		{
			examRepository.findById(ref.getStudentid());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return lst;
	}
	
	public List<Exam> showAllExams()
	{
		List<Exam> lst = null;
		
		try 
		{
			examRepository.findAll().forEach(lst::add);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
		return lst;
	}
}
