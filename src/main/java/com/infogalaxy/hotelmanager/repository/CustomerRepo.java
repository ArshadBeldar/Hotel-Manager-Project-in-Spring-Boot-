package com.infogalaxy.hotelmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infogalaxy.hotelmanager.entity.CustomerEntity;


public interface CustomerRepo extends JpaRepository<CustomerEntity,Integer>{

}
