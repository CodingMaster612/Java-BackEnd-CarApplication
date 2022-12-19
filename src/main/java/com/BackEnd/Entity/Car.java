package com.BackEnd.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	
	@Column(name="id")
	
	private Integer id;
	
	@Column(name="info")
	
	private String info;
	 
	@Column(name = "manufacturer")
	
	 private String manufacturer;
	 
	 @Column(name = "purchased")
	
	 private Integer purchased;
	 
	 @Column(name = "mileage")
	
	 private Integer mileage;
	 
	 @Column(name = "price")
	
	 private Integer price;
	 
	 @Column(name = "model")
	
	 private String model;
	 
	 @Column(name = "build")
	
	 private String build;
	 
	 @Column(name = "description")
	
	 private String description;
	
	 @Column(name="images")
	 private String images;
	 
	 
	 private Date accountCreationDate= new Date();
	 
	public Car() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getPurchased() {
		return purchased;
	}

	public void setPurchased(Integer purchased) {
		this.purchased = purchased;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", purchased=" + purchased + ", mileage=" + mileage
				+ ", price=" + price + ", model=" + model + ", build=" + build + ", description=" + description
				+ ", images=" + images + ", accountCreationDate=" + accountCreationDate + "]";
	}
	
		
	
	
}
