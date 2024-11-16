package com.thacha.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thacha.demo.model.Customer;
import com.thacha.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	private CustomerService customerService;
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService=customerService;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

}
