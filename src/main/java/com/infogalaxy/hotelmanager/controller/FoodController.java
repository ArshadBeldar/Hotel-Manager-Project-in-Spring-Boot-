package com.infogalaxy.hotelmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.hotelmanager.entity.FoodEntity;
import com.infogalaxy.hotelmanager.model.FoodModel;
import com.infogalaxy.hotelmanager.service.FoodService;

@RestController
@RequestMapping("/hotelapi")
public class FoodController {

	@Autowired
	FoodService foodService ;
	
	List<FoodEntity> foodEntities = new ArrayList<FoodEntity>();	
	FoodModel foodModel = new FoodModel();
	
	@GetMapping("/getall")
	public List<FoodEntity>getAll() {
		return foodService.getAllFood();
	}
	
	
	@PostMapping("/addfood")
	public void addFood(@RequestBody FoodModel foodModel) {		
		
		foodService.addFood(foodModel);
	}

}
