package com.karun.springbootacutatorexample.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	
	
	

	@Id
	@Column(name = "id")
	private int categoryId;

	@Column(name = "name")
	private String categoryName;

	//@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private List<Product> products;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	//public List<Product> getProducts() {
	//	return products;
	//}

	//public void setProducts(List<Product> products) {
	//	this.products = products;
	//}
}