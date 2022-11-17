<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com Customer Information</title>
<style>
h1{
     color: blue;
     text-align: center;
 }
body
     {
     background-image: url('airplane5.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     } 
.label{
        display: inline-block;
        width: 150px;
        text-align: left;
}
</style>
</head>

<body>
<h1>Customer Information</h1>
<a href="login.jsp">Login Page</a><br>
<a href="home.jsp">Home Page</a><br><br>
<div class="label">
 <form action="./pay" method="get">
        
        Name:<input type="text" name="username" "><br>
		Email:<input type="email" name="email"><br>
		Phone:<input type="text" name="Phone"><br>
		SSN:<input type="text" name="ssn"><br><br>		
	   <input type="submit" value=submit /> 
 </form>
 </div>
 
</body>
</html>