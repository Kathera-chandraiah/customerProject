package com.thacha.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thacha.demo.model.Customer;

@Repository
public interface CustomerRepository {
	Customer addCustomer(Customer customer);
	List<Customer> getCustomers();
}
