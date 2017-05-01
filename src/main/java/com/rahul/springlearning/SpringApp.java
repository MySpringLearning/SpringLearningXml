package com.rahul.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.springlearning.service.CustomerService;

public class SpringApp {

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		
		CustomerService customerService = appContext.getBean("customerService",CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
