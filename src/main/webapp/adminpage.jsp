<%@page import="org.simplilearn.entities.FlightsList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style>
body {
  background-color: lightblue;
}
h1{
     color: blue;
     text-align: center;
  }
 .center
  {
   display: block;
   margin-left: auto;
   margin-right: auto;
   width: 10%;
   border: 5px solid #555;
  }
</style>
</head>
<body>
<a href="login.jsp">User Login</a><br><br>

<h1 > Welcome Admin</h1>

<img src="admin.jpg" alt="admin image"   class="center"><br><br><br>

<a href="changepassword.jsp"> Change Password</a><br><br>
<a href="addsourcedestination.jsp"> Source Destination Master List</a><br><br>
<a href="addairlines.jsp">Airlines Master List</a><br><br>
<a href="addflights.jsp">All flights</a><br><br>
</body>
</html>