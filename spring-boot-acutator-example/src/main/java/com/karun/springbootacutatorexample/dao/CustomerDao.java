package com.karun.springbootacutatorexample.dao;

import java.util.List;

import com.karun.springbootacutatorexample.model.Customer;
import com.karun.springbootacutatorexample.model.Question;
import com.karun.springbootacutatorexample.model.Survey;


 
public interface CustomerDao {
	public List<Customer> getAllCustomers() ;
 
	public Customer getCustomer(int id) ;
 
	public Customer addCustomer(Customer customer);
 
	public void updateCustomer(Customer customer) ;
 
	public void deleteCustomer(int id) ;
	public int save(Survey survey);
	 public int save(Question question) ;


}