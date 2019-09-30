package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Report;

@Service
public class ReportService 
{
	@Autowired
	private ReportRepository repository;
	
	public List<Report> getStudentScoreById(int studid)
	{
		List<Report> lst = null;
		
		try 
		{
			lst = repository.findReportById(studid);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
		return lst;
	}
	
	public List<Report> getScoreByQuestion(int questionid)
	{
		List<Report> lst = null;
		
		try 
		{
			lst = repository.findReportByQuestionId(questionid);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
		return lst;
	}
	
	public List<Object[]> findAllReports()
	{
		List<Object[]> lst = null;
		
		try 
		{
			lst = repository.findAllReports();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
		return lst;
	}

}
