package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController 
{
	public StudentService service;
	
	@RequestMapping(value = "/index_student")
	public String studentLogin(Student ref, HttpServletRequest request)
	{
		HttpSession httpSession = request.getSession(true);
		
		if(service.validateStudent(ref))
		{
			httpSession.setAttribute("username", ref.getStudname());
			return "index_student";
		}
		else
		{
			return "login_failure";
		}
	}

}
