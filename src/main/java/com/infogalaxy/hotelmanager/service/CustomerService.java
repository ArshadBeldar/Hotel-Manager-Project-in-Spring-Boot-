package com.infogalaxy.hotelmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.hotelmanager.entity.CustomerEntity;
import com.infogalaxy.hotelmanager.model.CustomerModel;

public class CustomerService {
	
	List<CustomerEntity> customerEntities = new ArrayList<CustomerEntity>(); 
	
	public List<CustomerEntity> getCustomerInfo() {
		
		
		CustomerEntity customerEntity1 = new CustomerEntity(1,"Arshad","9527867261","Arshad@gmail.com");
		CustomerEntity customerEntity2 = new CustomerEntity(2,"Faizan","2345612340","Faizan@gmail.com");
		
				
		customerEntities.add(customerEntity1);
		customerEntities.add(customerEntity2);
		return customerEntities;
	}
	
	public void addCustomerInfo(CustomerModel customerModel) {
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCid(customerModel.getCid());
		customerEntity.setCname(customerModel.getCname());
		customerEntity.setCmobileno(customerModel.getCmobileno());
		customerEntity.setCemailid(customerModel.getCemailid());
		
		customerEntities.add(customerEntity);
	}
	
}
