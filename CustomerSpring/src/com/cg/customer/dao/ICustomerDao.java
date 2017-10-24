package com.cg.customer.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.customer.model.Customer;
//import com.cg.customer.exception.CustomerException;

public interface ICustomerDao {

	void addDetails(Customer bean);

	Customer retrieve(int custId);

	List<Customer> getDetails();

	boolean get(int customerId);

}
