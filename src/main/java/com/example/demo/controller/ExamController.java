package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Exam;
import com.example.demo.dto.Student;
import com.example.demo.dto.Teacher;
import com.example.demo.service.ExamService;

@Controller
public class ExamController 
{
	@Autowired
	public ExamService examService;
	
	@RequestMapping(value = "/addExam")
	public String addExam(Exam ref, HttpServletRequest request)
	{
		HttpSession httpSession = request.getSession();
		
		int tid = (Integer)httpSession.getAttribute("teacherid");
		Teacher teach = new Teacher();
		teach.setTeacherid(tid);
		
		Exam exam = new Exam();
		exam.setTeacher(teach);
		exam.setCourse(ref.getCourse());
		exam.setSemester(ref.getSemester());
		exam.setTitle(ref.getTitle());
		exam.setQdoc(ref.getQdoc());
		
		if(examService.saveExam(exam))
			return "exam_success";
		else
			return "exam_failure";
	}
	
	@RequestMapping(value = "/upload_exam")
	public String upload_ques()
	{
		return "upload_exam";
	}
	
	
//	public String viewExam(Student ref, HttpServletRequest request)
//	{
//		HttpSession httpSession = request.getSession();
//		
//		
//	}

}
