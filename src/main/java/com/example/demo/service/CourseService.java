package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Course;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses()
	{
		List<Course> lst = new ArrayList<Course>();
		
		try 
		{
			courseRepository.findAll().forEach(lst::add);;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return lst;
	}
}