<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com Registration Page</title>
<style>
body
     {
     background-image: url('airplane3.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     }
</style>
</head>
<body>
<form action="./register" method="post">
		UserName:<input type="text" name="username"><br>
		Password:<input type="password" name="password"><br>
		UserType:<select name="usertype">
			<option value="user">User</option>
			<option value="admin">Admin</option>
		</select>
		<input type="submit" value="Submit">
	</form>


</body>
</html>
