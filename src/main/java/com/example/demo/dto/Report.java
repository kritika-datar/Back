package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "report")
public class Report 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reportid")
	private int reportid;
	
	@Column(name = "score")
	private int score;
	
	@ManyToOne
	@JoinColumn(name = "questionid")
	private Question question;
	
	@ManyToOne
	@JoinColumn(name = "studid")
	private Student student;

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReportid() {
		return reportid;
	}

	public void setReportid(int reportid) {
		this.reportid = reportid;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
