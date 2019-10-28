package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.Login;

public interface LoginRepository extends CrudRepository<Login, Integer>{
	
	@Query(value = "SELECT * FROM login t where t.username = :username AND t.password = :password", nativeQuery = true)
	Optional<Login> findByUsernameAndPassword(@Param("username") String username, @Param("password")String password);

}
//t.user.id=?#{principal.id}