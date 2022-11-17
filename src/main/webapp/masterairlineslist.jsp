<%@page import="org.simplilearn.entities.Airlines"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com  Airlines master list</title>
</head>
<style>
{
     background-image: url('sky1.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     }
</style>
<body>
<a href="adminpage.jsp">Admin Home Page</a>
<h1>Airlines master list</h1>

    <%
        List<Airlines> airlines=(List<Airlines>)session.getAttribute("airlines");
		if (airlines!=null)
		{
	%>
	<table border="1">
		<tr>
			<th>Airline No</th>
			<th>Airline Name</th>
			
		</tr>
		<%
			

	    for(Airlines a : airlines)
		{
	%>
			<tr>
			    <td><%=a.getAirlineno()%></td>	
			    <td><%=a.getAirlineName()%></td>
			    <td><a href="./deleteAirlines?airlineno=<%=a.getAirlineno()%>">Delete</a></td>
			   				
			</tr>
	<% 
		} 
	%>
</table>
<%
	}
 
%>
</body>
</html>