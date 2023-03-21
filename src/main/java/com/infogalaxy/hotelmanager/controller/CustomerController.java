package com.infogalaxy.hotelmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	CustomerService customerService ;

	@GetMapping("/getcustomerinfo")
	public List<CustomerEntity> getCustomerInfo() {
	
		return customerService.getCustomerInfo();
	}
	
	@PostMapping("/addcustomerinfo")
	public String addCustomerInfo(@RequestBody CustomerModel customerModel) {
		System.out.println(customerModel.toString());
		
		customerService.addCustomerInfo(customerModel);
		
		return"Data Added Successfully ";
	}
}