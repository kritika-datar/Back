package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer>{

}
