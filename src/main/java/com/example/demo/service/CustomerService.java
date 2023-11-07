package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity1.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custrepository;
public void addCustomer(Customer  c) {
	custrepository.save(c);
}
}
