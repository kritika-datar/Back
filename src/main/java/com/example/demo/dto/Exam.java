package com.example.demo.dto;

import java.io.File;
import java.sql.Blob;
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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

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
	private int course;
	
	@Column(name = "semester")
	private String semester;
	
	@Column(name = "qdoc")
	private Blob qdoc;

	@OneToMany(mappedBy = "exam", fetch = FetchType.EAGER)
	private Set<Report> reports;
	
	@OneToMany(mappedBy = "exam", fetch = FetchType.EAGER)
	private Set<Question> questions;
		
	@Cascade(CascadeType.ALL)
	@ManyToOne
	@JoinColumn(name = "username")
	private Login login;
	
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
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public Blob getQdoc() {
		return qdoc;
	}

	public void setQdoc(Blob qdoc) {
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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}
