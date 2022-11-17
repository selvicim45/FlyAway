<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway.com Add Airlines</title>
<style>
.container {   
         margin: 0 auto;
         width: 210px;
         
    }
body
    {
    
     background-image: url("sky1.jpg");
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
<h1>Add Airlines to Master List</h1>
<div class="container">
<form action="./addairlines" method="get">
		Airlines Name<input type="text" name="airlineName"><br><br>
		<input type="submit" value="Submit">
</form>
</div>
</body>
</html>