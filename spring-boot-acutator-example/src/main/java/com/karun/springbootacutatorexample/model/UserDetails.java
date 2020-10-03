package com.karun.springbootacutatorexample.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetails {
	@Id @GeneratedValue
	private Integer userId;
	private String userName;
	@OneToMany(fetch=FetchType.EAGER)
	private Collection<Veichle> veichle=new ArrayList<Veichle>();
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Collection<Veichle> getVeichle() {
		return veichle;
	}
	public void setVeichle(Collection<Veichle> veichle) {
		this.veichle = veichle;
	}
	
	
	

}
