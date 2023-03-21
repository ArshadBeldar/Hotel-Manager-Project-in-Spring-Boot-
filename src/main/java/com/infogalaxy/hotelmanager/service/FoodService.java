package com.infogalaxy.hotelmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.hotelmanager.entity.FoodEntity;
import com.infogalaxy.hotelmanager.model.FoodModel;
import com.infogalaxy.hotelmanager.repository.FoodRepo;

@Service 
public class FoodService {
	
	@Autowired 
	FoodRepo foodRepo;
	
	List<FoodEntity> foodEntities = new ArrayList<FoodEntity>();
	
	public List<FoodEntity> getAllFood() {
		
		
		return foodRepo.findAll();
	}
	
	public void addFood(FoodModel foodModel1) {
		
		FoodEntity foodEntity = new FoodEntity();
		
		foodEntity.setFid(foodModel1.getFid());
		foodEntity.setFname(foodModel1.getFname());
		foodEntity.setPrice(foodModel1.getPrice());
		foodEntity.setQty(foodModel1.getQty());
		foodRepo.save(foodEntity);
		foodEntities.add(foodEntity);
	}
	
}

