package com.karun.springbootacutatorexample.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="Survey")
public class Survey {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column 
	 private String SURVEY_NAME;
	@Transient
	//@OneToMany
	//@JoinColumn(name ="SURVEY_ID")
	private List<String> QUESTION;
	public Survey()
	 {}
	
	
	public Survey(int id, String sURVEY_NAME, List<String> qUESTION) {
		super();
		this.id = id;
		SURVEY_NAME = sURVEY_NAME;
		QUESTION = qUESTION;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSURVEY_NAME() {
		return SURVEY_NAME;
	}
	public void setSURVEY_NAME(String sURVEY_NAME) {
		SURVEY_NAME = sURVEY_NAME;
	}
	public List<String> getQUESTION() {
		return QUESTION;
	}
	public void setQUESTION(List<String> qUESTION) {
		QUESTION = qUESTION;
	}
}