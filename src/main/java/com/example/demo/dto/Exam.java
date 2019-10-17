package com.example.demo.dto;

import java.io.File;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "examid")
	private int examid;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "semester")
	private String semester;
	
	@Column(name = "qdoc")
	private File qdoc;

	@OneToMany(mappedBy = "exam", fetch = FetchType.EAGER)
	private Set<Report> reports;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private Set<Question> questions;
	
	@ManyToOne
	@JoinColumn(name = "teacherid")
	private Teacher teacher;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public File getQdoc() {
		return qdoc;
	}

	public void setQdoc(File qdoc) {
		this.qdoc = qdoc;
	}

	public Set<Report> getReports() {
		return reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
