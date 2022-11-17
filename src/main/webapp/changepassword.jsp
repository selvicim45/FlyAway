<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<style>
.container {   
         margin: 0 auto;
         width: 210px;
         
    }
body
    {
    
     background-image: url("sky3.jpg");
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
 <h1>Change Password</h1>
 <div class="container">
  <form action= "./updatepassword"  method="post">
   User Name:<input type="text" name="username"><br><br><br>
   Old Password:<input type="password" name="oldpassword"><br><br><br>
   New Password:<input type="password" name="newpassword"><br><br><br>
   <input type="submit" value="Change Password">
 </form>
 </div>


</body>
</html>