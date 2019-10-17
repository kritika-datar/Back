package com.example.demo.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>
{
//	@Query("select T from teacher T where T.username = ?1 and T.password = ?2")
//	Teacher findTeacherByUsernameAndPassword(String username, String password);
	
//	@Modifying
//	@Query("update teacher T set T.password = ?2 where T.username = ?1")
//	int updateTeacherPassword(String username, String newpass);
}
