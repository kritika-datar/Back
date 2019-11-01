package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	
}
