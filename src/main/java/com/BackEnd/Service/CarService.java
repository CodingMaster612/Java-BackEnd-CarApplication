package com.BackEnd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.Entity.Car;
import com.BackEnd.Entity.User;
import com.BackEnd.repo.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo carRepo;

	

	public Car createCar(Car car) {
		
		 if(doesBuildExist(car.getBuild())) {
			 return null;
		 }
		
		
		if(doesDescriptionExist(car.getDescription())) {
			return null;
		}
		
		
		if(doesManufactureExist(car.getManufacturer())) {
	            return null;
	        }
		 if(doesMileageExists(car.getMileage())) {
			 return null;
		 }
		 
		 if(doesModelExists(car.getModel())) {
			 return null;
		 }
		 
		 if(doesPriceExists(car.getPrice())) {
			 return null;
		 }
		 if(doesPurchasedExists(car.getPurchased())) {
			 return null;
		 }
		
		 carRepo.save(car);

	        return car;
	}

	 public Car findCarById(Integer userId) {
	        return carRepo.findById(userId).get();
	    }

	public boolean doesPurchasedExists(Integer purchased) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesPriceExists(Integer price) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesModelExists(String model) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesMileageExists(Integer mileage) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesDescriptionExist(String description) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesBuildExist(String build) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean doesManufactureExist(String manufacturer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public List<Car> getAllCar() {
        return carRepo.findAll();
    }
    
    public Car getCarById(Integer id) {
        return carRepo.findById(id).get();
    }



	



	

	



	
}
