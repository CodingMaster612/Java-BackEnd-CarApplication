<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/login.css" />
    <title>Car Information</title>
  </head>
  <body>
    <div class="form">
      <p>Search Car</p>

      <form:form modelAttribute="car" action="searchLog" method="get">
      
        
        <form:input path="id" placeholder="Id" type="id" />
        <form:input path="manufacturer" placeholder="Manufacturer" type="text" />
        
        <form:input path="mileage" placeholder="Mileage" type="mileage" />
        
        <form:input  path="price" placeholder="Price" type="price" />
        
        <form:input path="model" placeholder="Model" type="model" />
        
        <form:button type="submit">Submit</form:button>
       
      </form:form>
      
      
     
    </div>
    
    
    
  </body>
</html>