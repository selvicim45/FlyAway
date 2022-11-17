<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Login Page</title>
<style>
.container {   
         margin: 0 auto;
         width: 210px;
         }
body
     {
     background-image: url('airplane2.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     }
</style>
</head>
<body>
 <div class="container">
	<form action="./login" method="post">
		Username:<input type="text" name="username"><br><br>
		Password:<input type="password" name="password"><br><br>
		UserType:<select name="usertype">
			      <option value="user">User</option>
			      <option value="admin">Admin</option>
		         </select><br><br>
		<input type="submit" value="Login">
		
	</form>
</div>
	
	
	
</body>
</html>

