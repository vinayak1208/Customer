package com.cg.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.customer.model.Customer;
import com.cg.customer.service.ICustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping("/start")
	public String registeration()
	{
	return "CustomerForm";
	}
	
	
	
	/*@RequestMapping("/success")
	public String success()
	{
		
		return "CustomerSuccess";
	}*/
	@RequestMapping("/success")
	public ModelAndView success(Customer bean)
	{
		service.addDetails(bean);
	  return new ModelAndView("CustomerSuccess","reg",bean);
	}
	
	@RequestMapping("/searchById")
	public String retrieveById()
	{
		return "SearchId";
		
	}
	
	
	
	@RequestMapping("/CheckId")
	public ModelAndView search(Customer bean)
	{
		bean=service.retrieve(bean.getCustomerId());
		return new ModelAndView("CustomerSuccess","reg",bean);
	}
	
	@RequestMapping("/getAll")
	public ModelAndView details()
	{
		List<Customer> list;
		list=service.getDetails();
		return new ModelAndView("Details","list",list);
	}
	
	@RequestMapping("/delete")
	public String delete()
	{
		return "delete";
		
	}
	
	@RequestMapping("/deleteDetail")
	public String get(Customer bean)
	{
		service.get(bean.getCustomerId());
		return "deleteDetails";
		
	}
	
	@RequestMapping("/index")
	public String start()
	{
		return "index";
		
	}
	
	
	
	
	
	
}
