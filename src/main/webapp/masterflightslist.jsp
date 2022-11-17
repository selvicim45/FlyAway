<%@page import="org.simplilearn.entities.FlightsList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MasterFlightsList</title>

</head>
<body>
<a href="adminpage.jsp">Admin Home Page</a><br><br>
<h1>The Master List of Flights</h1>
    <%
        List<FlightsList> flights=(List<FlightsList>)session.getAttribute("flights");
		if (flights!=null)
		{
	%>
	<table border="1">
		<tr>
			<th>Flight No</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Airlines</th>
			<th>Price</th>
		</tr>
		<%
			

	    for(FlightsList f : flights)
		{
	%>
			<tr>
			    <td><%=f.getFlightno()%></td>
				<td><%=f.getSource()%></td>
				<td><%=f.getDestination()%></td>
				<td><%=f.getAirlines()%></td>
				<td><%=f.getPrice()%></td>
		    	<td><a href="./delete?flightno=<%=f.getFlightno()%>">Delete</a></td>		
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