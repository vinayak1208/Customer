package com.cg.customer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@NamedQueries(@NamedQuery(name = "getAllCustomers", query = "SELECT cust FROM Customer cust"))

public class Customer {
	
	private String customerName,customerEmail;
	private Date customerDOB;
	@Id
	//@Column(name = "custId")
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="CUSTOMER_ID_SEQ", allocationSize=10)*/
    private int customerId;
    private int customerMobile;
    
	public Date getCustomerDOB() {
		return customerDOB;
	}
	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(int customerMobile) {
		this.customerMobile = customerMobile;
	}
    
    
}
