package com.karun.springbootacutatorexample.controller;

import java.util.List;

import com.karun.springbootacutatorexample.dao.CustomerDaoImpl;
import com.karun.springbootacutatorexample.model.Customer;
import com.karun.springbootacutatorexample.model.Question;
import com.karun.springbootacutatorexample.model.Survey;
import com.karun.springbootacutatorexample.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class CustomerController {
 
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerDaoImpl customerDaoImpl;
 
	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllCustomers(Model model) {
 
		List<Customer> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return "customerDetails";
	}
 
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}
	
	@RequestMapping(value="/saveSurvey", method=RequestMethod.GET)
	 public ModelAndView newuserForm(Model model)
	 {
		Survey survey = new Survey();
        model.addAttribute("survey", survey);

		return new ModelAndView("newSurvey");
	 }
	
	@RequestMapping(value="/saveSurvey", method=RequestMethod.POST)
	 public void create(@ModelAttribute("newSurvey")Survey survey)
	 {
		  
	  int surveyId = customerService.save(survey);
	
	    List<String> questions = survey.getQUESTION();
	  Question ques = null;
	  
	   for(String question : questions)
	   {
	    ques = new Question();
	    ques.setQUESTION(question);
	   ques.setSurvey(survey);
	   int quesId = customerService.save(ques);
	   }
	   
	 }
	
	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
 
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {	
		if(customer.getId()==0)
		{
			customerService.addCustomer(customer);
		}
		else
		{	
			customerService.updateCustomer(customer);
		}
 
		return "redirect:/getAllCustomers";
	}
 
	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id,Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listOfCustomers", this.customerService.getAllCustomers());
		return "customerDetails";
	}
 
	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/getAllCustomers";
 
	}	
}
 