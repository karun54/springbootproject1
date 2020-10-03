package com.karun.springbootacutatorexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="questions")

public class Question {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	 @Column
	 private String QUESTION;
	 
	 @ManyToOne
	 @JoinColumn(name ="SURVEY_ID")
	 private Survey survey;
	 
	 public Question()
	 {
	 }

	public Question(int id, String qUESTION, Survey survey) {
		super();
		this.id = id;
		QUESTION = qUESTION;
		//this.survey = survey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQUESTION() {
		return QUESTION;
	}

	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	} 
	 
	 
	
}

