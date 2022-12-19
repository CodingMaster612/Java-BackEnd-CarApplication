package com.BackEnd.Controller;

import java.util.List;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.BackEnd.Entity.Car;
import com.BackEnd.Entity.User;
import com.BackEnd.Service.CarService;
import com.BackEnd.Service.UserService;


@Controller
public class CarController {
	@Autowired
    CarService carService;
	
	
	@Autowired
    UserService userService;
	
	
	 
	
	 @GetMapping("/CarLog")
	    public String CarLog(Model model) {

	        /* Add the object to your model here, since its a sign up form
	         * for user data, we need to add a blank user object to the form
	         * so we use our blank constructor
	         */
	        model.addAttribute("car", new Car());

	        // Finally we return the sign up page, should be same spelling as your JSP page here
	        return "CarLog";
	    }
	 @PostMapping("/CarLog")
	 public String CarLog(@ModelAttribute("car") Car car, Model model) {

	        /* We send the data to our service to do our logic and whatever it returns
	         * we need to process accordingly
	         */
	        Car loggedCar= carService.createCar(car);

	        // If the user cannot be created, we need to tell the user why
	        if(loggedCar == null) {
	            // We add a message to the model incase the user couldnt be signed up properly
	            model.addAttribute("message", "Your CarLog isn't valid");

	            // We return them to the sign up page so they can try again
	            return "CarLog";
	        }

	        // Add another blank user on model for signIn in case of a successful creation,
	        // so you don't auto populate data
	        model.addAttribute("car", new Car());

	        // return sign in so they can verify themself
	        return "CarLog";
	    }
	 
	 @GetMapping("/searchLog")
	    public String CarLogSearch(Model model) {

	        /* Add the object to your model here, since its a sign up form
	         * for user data, we need to add a blank user object to the form
	         * so we use our blank constructor
	         */
	        model.addAttribute("car", new Car());

	        // Finally we return the sign up page, should be same spelling as your JSP page here
	        return "searchLog";
	    }
	 @PostMapping("/searchLog")
	 public String CarLogSearch(@ModelAttribute("searchLog") Car car, Model model) {

	        /* We send the data to our service to do our logic and whatever it returns
	         * we need to process accordingly
	         */
	        Car loggedCar= carService.createCar(car);

	        // If the user cannot be created, we need to tell the user why
	        if(loggedCar == null) {
	            // We add a message to the model incase the user couldnt be signed up properly
	            model.addAttribute("message", "Your CarSearch isn't valid");

	            // We return them to the sign up page so they can try again
	            return "searchLog";
	        }

	        // Add another blank user on model for signIn in case of a successful creation,
	        // so you don't auto populate data
	        model.addAttribute("car", new Car());

	        // return sign in so they can verify themself
	        return "searchLog";
	    }
	 
	 
	 
	 
	 
	 @GetMapping("/Products")
	    public String viewAllCar(Model model, HttpSession session) {

	        Integer loggedInCarId = (Integer) session.getAttribute("loggedInCarId");
	        

	        if(loggedInCarId != null) {
	            Car loggedInCar = carService.findCarById(loggedInCarId);
	            model.addAttribute("loggedInCar", loggedInCar);
	            
	        }

	        List<Car> allCars = carService.getAllCar();

	        model.addAttribute("allCars", allCars);
	        
	        
	       

	        return "Products";
	    }

	    @GetMapping("/confirmation/{carId}")
	    public String addToCart(@PathVariable("carId") Integer carId, HttpSession session) {

	        Car car = carService.getCarById(carId);
	        Integer loggedInCarId = (Integer) session.getAttribute("loggedInCarId");
	        Car loggedInCar;
	        if(loggedInCarId != null) {
	            loggedInCar = carService.findCarById(loggedInCarId);
	        }
	        // System.out.println(product.toString());

	        return "Confirmation";

	    }
	    
	    
	    
	 
} 
	 



