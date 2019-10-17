package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Login;

public interface LoginRepository extends CrudRepository<Login, Integer>{

	Optional<Login> findById(String username);

}
