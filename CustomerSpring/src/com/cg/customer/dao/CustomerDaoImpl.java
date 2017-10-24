package com.cg.customer.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.customer.model.Customer;
//import com.cg.customer.exception.CustomerException;
//import com.cg.customer.util.Utility;
@Repository
public class CustomerDaoImpl implements ICustomerDao{

	@PersistenceContext
	EntityManager entityManager ;

	@Override
	public void addDetails(Customer bean) {
		// TODO Auto-generated method stub
		
		//entityManager.getTransaction().begin();
		entityManager.persist(bean);
		entityManager.flush();
	
	}

	@Override
	public Customer retrieve(int custId) {
		// TODO Auto-generated method stub
		Customer customer = null;
		customer = entityManager.find(Customer.class, custId);
		return customer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getDetails() {
		// TODO Auto-generated method stub

		Query query = (Query) entityManager.createNamedQuery("getAllCustomers");
		List<Customer> li= query.getResultList();
		return li;
	}

	@Override
	public boolean get(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = null;
		customer = entityManager.find(Customer.class, customerId);
		if(customer!=null)
		{
		entityManager.remove(customer);
		}
		return true;
		
      
		
	}
	
	

	/*@Override
	public List<Customer> retrieveDetails() {
		// TODO Auto-generated method stub
		
		Query query = (Query) entityManager.createNamedQuery("getAllCustomers");
		@SuppressWarnings("unchecked")
		List<Customer> custList = query.getResultList();
		
		return custList;
	}

	@Override
	public Customer retrieveById(int custId) throws CustomerException {
		
		Customer customer = null;
		customer = entityManager.find(Customer.class, custId);
		
		if(customer == null){
			
			throw new CustomerException(custId);
		}
		return customer;
		
	}

	@Override
	public Customer retrieveByMobile(Long mobile) throws CustomerException {
		// TODO Auto-generated method stub
		Customer mobList = null;
		try{
			
			String findByMobile = "SELECT cust FROM Customer cust WHERE cust.mobile=:cMobile";
			
			TypedQuery<Customer> query = entityManager.createNamedQuery(findByMobile, Customer.class);
			query.setParameter("cMobile", mobile);
			
			mobList = query.getSingleResult();
		}
		catch(Exception e){
	
			throw new CustomerException(mobile);
		}
		
		return mobList;
	}

	@Override
	public void deleteDetails(Customer bean) {
		// TODO Auto-generated method stub
		
		entityManager.getTransaction().begin();
		entityManager.remove(bean);
		entityManager.getTransaction().commit();
	}

	@Override
	public void updateDetails(Customer bean) {
		// TODO Auto-generated method stub
		
		entityManager.getTransaction().begin();
		entityManager.merge(bean);
		entityManager.getTransaction().commit();
	}
*/
	
	
	
}
