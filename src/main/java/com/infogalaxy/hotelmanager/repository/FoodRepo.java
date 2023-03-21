package com.infogalaxy.hotelmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infogalaxy.hotelmanager.entity.FoodEntity;

public interface FoodRepo extends JpaRepository<FoodEntity, Integer>{

	
	
}
