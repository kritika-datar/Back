package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Integer> 
{
	//@Query("select A from Answer A Right Outer join A.quest Q where Q.rollno = ?1")
//	List<Answer> findAllAnswersByStudents(String rollno);
	
//	@Query("select A from Answer A")
//	List<Object[]> findAllAnswers();

}
