package com.BackEnd.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * Entities are model/domain classes
 * You use these to describe the objects you will use in your project
 */
@Entity
@Table(name="user")
public class User {
	
	@Id
	
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="id")
	
    
    private Integer id;
	
   
	@Column(name = "username", unique = true, nullable = false)
    private String username;

     // Column maps to the same name as the column name in the database, it is case sensitive
     @Column(name = "password", nullable = false)
     
     
    private String password;
    
    
    @OneToOne
    @JoinColumn(name="cart_id")
    Cart cart;

    @OneToMany
    @JoinColumn(name="user_id")
    List<CreditCard> daBank;
    
    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

}
