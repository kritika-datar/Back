package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Report;

public interface ReportRepository extends CrudRepository<Report, Integer>
{
//	@Query("select R from Report R Right Outer join R.studid S where S.rollno = ?1")
//	List<Report> findReportById(int studid);
	
	//@Query("select R from Report R Right Outer join R.questionid Q where Q.questionid = ?1")
//	List<Report> findReportByQuestionId(int questionid);
	
//	@Query("select R from Report R")
//	List<Object[]> findAllReports();

}
