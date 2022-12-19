package com.BackEnd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BackEnd.Entity.Car;
import com.BackEnd.Entity.User;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer>{
	
	
	@Query(value="select * from user where build=?1 and description=?2 and maufacture=?3 and mileage=?4 and model=?5 and price=?6 and purchased=?7", nativeQuery = true)
	public Car findByInformationOnCar(String build , String description, String manufacture , Integer mileage, String model, Integer price, Integer purchased);
}

