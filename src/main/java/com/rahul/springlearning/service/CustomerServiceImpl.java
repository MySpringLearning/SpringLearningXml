package com.rahul.springlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rahul.springlearning.model.Customer;
import com.rahul.springlearning.repository.CustomerRepositoryInterface;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepositoryInterface customerRep;// = new HibernateCustomerRepositoryImpl();
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rahul.springlearning.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRep.findAll();

	}

	public void setCustomerRepository(CustomerRepositoryInterface customerRepository) {
		System.out.println("Called Custom Repository Setter");
		this.customerRep = customerRepository;
	}

	public CustomerServiceImpl() {

	}

	@Autowired
	public CustomerServiceImpl(CustomerRepositoryInterface customerRep) {
		super();
		System.out.println("Constructor called!");
		this.customerRep = customerRep;
	}

}
