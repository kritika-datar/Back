package com.example.demo.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
//	@Query("select S from student S where S.username = ?1 and S.password = ?2")
//	Student findStudentByUsernameAndPassword(String username, String password);
	
//	@Modifying
//	@Query("update Student S set S.password = ?2 where S.username = ?1")
//	int updateStudentPassword(String username, String newpass);
}
