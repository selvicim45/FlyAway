<%@page import="org.simplilearn.entities.SourceDestination"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway.com Master Source Destination List</title>
<style>
{
     background-image: url('sky2.jpg');
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
  }
</style>
</head>
<body>
<a href="adminpage.jsp">Admin Home Page</a><br><br>
<h1>Master Source  Destination List</h1>


    <%
        List<SourceDestination> sourcedestination=(List<SourceDestination>)session.getAttribute("sourcedestination");
		if (sourcedestination!=null)
		{
	%>
	<table border="1">
		<tr>
			<th>SD NO</th>
			<th>Source</th>
			<th>Destination</th>
			
		</tr>
		<%			

	    for(SourceDestination sd : sourcedestination)
		{
	   %>
			<tr>
			    <td><%=sd.getSdno() %>
			    <td><%=sd.getSource()%></td>	
			    <td><%=sd.getDestination()%></td>	
			    <td><a href="./deleteSourceDestination?sdno=<%=sd.getSdno()%>">Delete</a></td>			    	
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