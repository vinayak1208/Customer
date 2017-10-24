package com.cg.customer.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.customer.model.Customer;

public interface ICustomerService {

	void addDetails(Customer bean);

	Customer retrieve(int custId);

	List<Customer> getDetails();

	boolean get(int customerId);

}
