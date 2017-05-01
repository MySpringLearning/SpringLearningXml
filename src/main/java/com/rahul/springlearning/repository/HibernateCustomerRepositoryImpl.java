package com.rahul.springlearning.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.rahul.springlearning.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepositoryInterface {
	
	@Value("${dbUserName}")
	private String dbUserName;
	
//	public void setDbUserName(String dbUserName) {
//		this.dbUserName = dbUserName;
//	}

	/* (non-Javadoc)
	 * @see com.rahul.springlearning.repository.CustomerRepositoryInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("rahul");
		customer.setLastName("kumar");

		customerList.add(customer);

		System.out.println(dbUserName);
		
		return customerList;
	}

}
