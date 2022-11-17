<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com HomePage</title>
<style>
 fieldset.optiongroup
 {
 border-width:10px;
 border-color:"pink";
 }
 h1{
     color: blue;
     text-align: center;
 }
 body
     {
     background-image: url('airplane4.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     }
     .label
        {
        display: inline-block;
        width: 150px;
        text-align: left;
       }
 </style>
  
</head>
<body>
 
  <h1>Select Your Flight</h1>
 <a href="login.jsp">Login Page</a><br><br><br>
  <form action="./home" method="get">
	<div class="label">
	    Start Date          :<input type="date" name="startdate"><br><br>
		End date            :<input type="date" name="enddate"><br><br>
		Source              :<input type="text" name="source"><br><br>		
		Destination         :<input type="text" name="destination"><br><br>
		Number of travelers :<input type="text" name="nooftravelers"><br><br>
		
		<input type="submit" value="Search">
	</div>
  </form>
  
</body>
</html>