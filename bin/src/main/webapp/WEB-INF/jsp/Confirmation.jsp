<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/Confirmation.css" />
    


    <title>Confirmation</title>
  </head>
  <body>
    
        
        <ul class="nav">
          <li id="settings">
              
          </li>
          
          <li>
              <a href="/">Log Out</a>
             
          </li>
          <li id="search">
              <form action="" method="get">
                  
                  
                  
                  <input type="text" name="search_text" id="search_text"placeholder="Search"/>
                  <input type="button" name="search_button" id="search_button">
                  
              </form>
              
              

  			

          </li>
          <li id="options">
              <a>Cart</a>
              <ul class="subnav">
                  
                 
                  <li> <a href= "/Products">Products</a></li>
                   <li> <a href= "">Cart</a></li>
                    <!-- <li> <a href= "/order">History</a></li> -->
                  
                  
              </ul>
          </li>
      </ul>
      	<c:if test="${user != null}">
      	<div>
      	${user.getUsername()}
      	
      	
      	</div>
      	</c:if>
        <h1 class="title">Order Confirmed</h1>
        


   
       
        
      
  </body>
</html>
