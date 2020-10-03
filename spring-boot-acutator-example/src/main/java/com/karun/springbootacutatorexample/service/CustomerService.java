package com.karun.springbootacutatorexample.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karun.springbootacutatorexample.dao.CustomerDao;
import com.karun.springbootacutatorexample.model.Customer;
import com.karun.springbootacutatorexample.model.Question;
import com.karun.springbootacutatorexample.model.Survey;


@Service("customerService")
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Transactional
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}
	@Transactional
	public int save(Survey survey)
	{
		return customerDao.save(survey);
	}
	
	@Transactional
	public int save(Question question)
	{
		return customerDao.save(question);
	}

}
