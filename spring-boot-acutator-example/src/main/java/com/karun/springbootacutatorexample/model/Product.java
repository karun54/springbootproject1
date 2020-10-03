package com.karun.springbootacutatorexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	private int productId;

	public Product()
	{
		
	}
	public Product(int productId, String productName, double price,
			String description) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.description = description;
	}

	@Column(name = "name")
	private String productName;

	@Column(name = "price")
	private double price;

//	@JoinColumn(name = "category_id")
//	private Category categoryId;
	@Column(name="description")
	private String description;
	
	//public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		this.category = category;
	//}

	@ManyToOne
	private Category category;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public Category getCategoryId() {
//		return categoryId;
//	}

//	public void setCategoryId(Category categoryId) {
//		this.categoryId = categoryId;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}