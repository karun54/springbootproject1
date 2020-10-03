package com.karun.springbootacutatorexample.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.karun.springbootacutatorexample.model.Customer;
import com.karun.springbootacutatorexample.model.Question;
import com.karun.springbootacutatorexample.model.Survey;
 
@Repository
public class CustomerDaoImpl implements CustomerDao{
 
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
 
	public List<Customer> getAllCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Customer>  customerList = session.createQuery("from Customer").list();
		return customerList;
	}
 
	public Customer getCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}
 
	public Customer addCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(customer);
		return customer;
	}
 
	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(customer);
	}

	public int save(Survey survey)
	 {
		 return (Integer) sessionFactory.getCurrentSession().save(survey);
	 }
	
	
	 public int save(Question question) {
	  return (Integer) sessionFactory.getCurrentSession().save(question);
	 }
	
	public void deleteCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer p = session.load(Customer.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	} 
}
 