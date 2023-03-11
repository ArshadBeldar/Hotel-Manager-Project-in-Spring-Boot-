package com.infogalaxy.hotelmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.hotelmanager.entity.FoodEntity;

@RestController
@RequestMapping("/hotelapi")
public class FoodController {

	
	List<FoodEntity> foodEntities = new ArrayList<FoodEntity>();	
	
	@GetMapping("/getall")
	public List<FoodEntity> name() {
		FoodEntity foodEntity= new FoodEntity(1,"Burgur",125,10);
		FoodEntity foodEntity1= new FoodEntity(2,"Noodles",150,10);
		
		foodEntities.add(foodEntity);
		foodEntities.add(foodEntity1);
		
		
		return foodEntities;
	}
	
	
	@PostMapping("/addfood")
	public void addFood(@RequestBody FoodEntity foodEntity3) {
		
	foodEntities.add(foodEntity3);	
	
	}
	
}
