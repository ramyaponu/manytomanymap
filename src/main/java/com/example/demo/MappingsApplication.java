package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity1.Customer;
import com.example.demo.entity2.Items;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class MappingsApplication implements CommandLineRunner {
	@Autowired
private CustomerService custservice;;
	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	addDetails();	
		
	}

public void addDetails() {
	Customer c=new Customer();
	c.setCustName("krishna");
	c.setCustName("shiva");
	Set<Customer> cust=new HashSet<>();
	cust.add(c);
	Items i=new Items();
	i.setItemName("phone");
	i.setItemName("tab");
	Set<Items> items=new HashSet<>();
	items.add(i);
	c.setSet(items);
	custservice.addCustomer(c);
}
}
