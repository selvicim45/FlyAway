<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway.com Add Source Destination </title>
<style>
body
    {
    
     background-image: url("airplane2.jpg");
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
    }
.container
{   
         margin: 0 auto;
         width: 210px;
         
}
h1 {
  text-align: center;
}

</style>
</head>
<body>
<a href="adminpage.jsp">Admin Home Page</a><br><br>
<h1>Add Source destination to Master List</h1>
<div class = "container">
<form action="./addsourcedestination" method="get">
   Source:<input type="text" name="source"><br><br>
   Destination:<input type="text" name="destination"><br><br>
   <input type="submit" value="Submit">
</form>
</div>
</body>
</html>