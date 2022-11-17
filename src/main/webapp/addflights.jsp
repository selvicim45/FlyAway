<%@page import="org.simplilearn.entities.FlightsList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com Admin Add Flights</title>
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
h1 {
  text-align: center;
}

</style>
</head>

<body>
<a href="adminpage.jsp">Admin Home Page</a><br><br>
<h1>Add Flights to Master List</h1>
<div class="container">
<form action="./addflights" method="get">
		
		Source<input type="text" name="source"><br>
		Destination<input type="text" name="destination"><br>
		AirLines<input type="text" name="airlines"><br>
		Price<br><input type="text" name="price"><br><br><br>
		<input type="submit" value="Submit">
	
</form>
</div>
</body>
</html>