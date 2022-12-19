package com.BackEnd.Service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.Entity.Car;
import com.BackEnd.Entity.Cart;
import com.BackEnd.Entity.User;
import com.BackEnd.repo.UserRepo;




@Service
public class UserService {


   
	@Autowired
    UserRepo userRepo;
    
    @Autowired
    CartService cartService;

    public User createAccount(User user) {

        // 1) Save your cart for your user
        Cart cart = cartService.save(new Cart());
        // 2) Add the cart to the user object so they can have one
        user.setCart(cart);
        // 3) Save the user
        return save(user);
    }
    
    public User save(User user) {
        return userRepo.save(user);
    }
    
    public User findByEmailAndPassword(User user) {
        return userRepo.findByUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    public User findUserById(Integer userId) {
        return userRepo.findById(userId).get();
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
    
}