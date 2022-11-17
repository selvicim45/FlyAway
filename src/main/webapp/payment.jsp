<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com Payment</title>
<style>
.container {   
         margin: 0 auto;
         width: 210px;
         
    }
body
    {
    
     background-image: url("sky2.jpg");
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
    }
 h1 
 {
  text-align: center;
 }
    

</style>
</head>
<body>

<h1>Payment Page</h1>
<a href="login.jsp">Login Page</a><br>
<a href="home.jsp">Home Page</a><br>
<div class="container">
<form action="./confirmation" method="post">
       Credit Card Number<input type="text" name="creditcardnumber"><br><br>
	   Expiration date:<input type="date" name="expirationdate"><br><br>
	   pin number:<input type="text" name="text"><br><br>
			
	   <input type="submit" value="Pay" > 
 </form>
 </div>
</body>
</html>