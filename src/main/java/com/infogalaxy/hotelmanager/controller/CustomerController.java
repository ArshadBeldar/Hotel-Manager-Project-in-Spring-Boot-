package com.infogalaxy.hotelmanager.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.hotelmanager.entity.CustomerEntity;
import com.infogalaxy.hotelmanager.model.CustomerModel;
import com.infogalaxy.hotelmanager.service.CustomerService;

@RestController
@RequestMapping("/hotelapi")
public class CustomerController {
	
	
	CustomerService customerService = new CustomerService();

	@GetMapping("/getcustomerinfo")
	public List<CustomerEntity> getCustomerInfo() {
	
		return customerService.getCustomerInfo();
	}
	
	@PostMapping("/addcustomerinfo")
	public void addCustomerInfo(@RequestBody CustomerModel customerModel) {
		
		customerService.addCustomerInfo(customerModel);
	}
}