<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>
<html>
<head>
	
    
    <link rel="stylesheet" href="/css/Products.css">
</head>
<body class="flex-col">
	<div class="flex-row header">
       
        <c:choose>
            <c:when test="${loggedInCar != null}">
                
                
            </c:when>    
            
        </c:choose>
    </div>
	<div class="flex-row main-content">
        <div class="flex-row center full-width">
            
            
            <c:forEach var="car" items="${allCars}">
                
                
                <div class="list-item">
                    
                    <div>${car.getId()}</div>
                    <div>${car.getInfo()}</div>
                    <div>${car.getDescription()}</div>
                    <div>${car.getManufacturer()}</div>
                    <div>${car.getModel()}</div>
                    <div>${car.getPrice()}</div>
                    <div>${car.getPurchased()}</div>
                    <div>${car.getAccountCreationDate()}</div>
                    <img src="${car.getImages()}" />
                   
                  	
                    <button class="buy-button"><a class="button-link" href="/confirmation/${car.getId()}">Add to cart</a></button>
                	
             
                </div>
<!--                 create aother form tag and place button in it and add img tag to get car image 
 -->                
            </c:forEach>
            
            
            
        </div>
    </div>
</body>

</html>