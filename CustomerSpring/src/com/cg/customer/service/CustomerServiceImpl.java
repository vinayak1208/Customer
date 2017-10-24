package com.cg.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customer.dao.ICustomerDao;
import com.cg.customer.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerDao dao;
	
	@Override
	public void addDetails(Customer bean) {
		// TODO Auto-generated method stub
		dao.addDetails(bean);
	}

	@Override
	public Customer retrieve(int custId) {
		// TODO Auto-generated method stub
		return dao.retrieve(custId);
	}

	@Override
	public List<Customer> getDetails() {
		// TODO Auto-generated method stub
		return dao.getDetails();
	}

	@Override
	public boolean get(int customerId) {
		// TODO Auto-generated method stub
		return dao.get(customerId);
	}

	
}
