package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Exam;

public interface ExamRepository extends CrudRepository<Exam, Integer>
{

}
