package com.thacha.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thacha.demo.model.Customer;
import com.thacha.demo.repository.CustomerJpaRepository;
import com.thacha.demo.repository.CustomerRepository;
@Service
public class CustomerService implements CustomerRepository{
	
	private CustomerJpaRepository customerJpaRepository;
	@Autowired
	public CustomerService(CustomerJpaRepository customerJpaRepository) {
		this.customerJpaRepository=customerJpaRepository;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerJpaRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers=customerJpaRepository.findAll();
		return customers;
	}
	
	

}
