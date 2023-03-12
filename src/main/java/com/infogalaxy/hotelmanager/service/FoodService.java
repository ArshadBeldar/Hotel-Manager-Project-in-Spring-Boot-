package com.infogalaxy.hotelmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.hotelmanager.entity.FoodEntity;
import com.infogalaxy.hotelmanager.model.FoodModel;

public class FoodService {

	List<FoodEntity> foodEntities = new ArrayList<FoodEntity>();
	public List<FoodEntity> getAllFood() {
		FoodEntity foodEntity= new FoodEntity(1,"Burgur",125,10);
		FoodEntity foodEntity1= new FoodEntity(2,"Noodles",150,10);
		foodEntities.add(foodEntity);
		foodEntities.add(foodEntity1);
		
		return foodEntities;
	}
	
	public void addNewFood(FoodModel foodModel) {
		
		FoodEntity foodEntity = new FoodEntity();
		
		foodEntity.setFid(foodModel.getFid());
		foodEntity.setFname(foodModel.getFname());
		foodEntity.setPrice(foodModel.getPrice());
		foodEntity.setQty(foodModel.getQty());
		
		foodEntities.add(foodEntity);
	}
	
}
