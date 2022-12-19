package com.BackEnd.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.Entity.Car;
import com.BackEnd.Entity.Cart;
import com.BackEnd.Entity.User;
import com.BackEnd.repo.CartRepo;

@Service
public class CartService {
    
    @Autowired
    CartRepo cartRepo;

    @Autowired
    CarService carService;

    public Cart save(Cart cart) {
        return cartRepo.save(cart);
    }
    
    public User addToCart(User user, Car car) {

        // 1) Add the Product to the cart
        user.getCart().getCars().add(car);
        // 2) save the cart to link your foreign key on the relational table
        save(user.getCart());
        // 3) return the Parent object
        return user;

    }

    public User removeFromCart(User user, Integer carId) {

        // 1) Get the product object with its id from the productService
        Car productToRemove = carService.getCarById(carId);
        // 2) remove the product object from the list of products in the Sapps cart
        user.getCart().getCars().remove(productToRemove);
        // 3) save the cart to remove the foreign keys
        save(user.getCart());
        // 4) Return the parent object
        return user;

    }

    public void deleteCart(Cart cart) {
        
        cartRepo.delete(cart);
    }

    public void deleteCartById(Integer cartId) {
        cartRepo.deleteById(cartId);
    }

}
