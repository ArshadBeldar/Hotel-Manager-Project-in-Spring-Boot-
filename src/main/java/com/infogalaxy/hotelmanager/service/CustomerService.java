package com.infogalaxy.hotelmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infogalaxy.hotelmanager.entity.CustomerEntity;
import com.infogalaxy.hotelmanager.model.CustomerModel;
import com.infogalaxy.hotelmanager.repository.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
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
		
		customerRepo.save(customerEntity);
	}
	
}
