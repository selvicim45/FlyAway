
<%
	if(session.getAttribute("user")!=null)
	{
%>
<%@page import="org.simplilearn.entities.FlightsList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com</title>
</head>
<body>
<a href="home.jsp">Home Page</a><br><br>
	<h1> Available Flights</h1>
	
	
	<h2>For the selected dates</h2>
	<%
	
	List<FlightsList> flights=(List<FlightsList>)session.getAttribute("flights");
	String startdate=(String)request.getAttribute("startdate");
	String enddate=(String)request.getAttribute("enddate");	
	
	
	out.println("Start Date  : "+ startdate);
	out.println("Return Date : "+ enddate);
	
	
	  
	  
	  String sdate = request.getParameter("startdate");
	  //out.println(sdate);
	  String edate = request.getParameter("enddate");
	  //out.println(edate);
	  String source1 = request.getParameter("source");
	  //out.println(source1);
	  String destination1 = request.getParameter("destination");
	  //out.println(destination1);
	  String nooftravelers1 = request.getParameter("nooftravelers");
	  //out.println(nooftravelers1);
	  
	  
	  request.getSession().setAttribute("startdate", sdate);
	  request.getSession().setAttribute("enddate", edate);
	  request.getSession().setAttribute("source", source1);
	  request.getSession().setAttribute("destination", destination1);
	  request.getSession().setAttribute("nooftravelers",nooftravelers1);
	  
	
	  if(flights!=null)
	  {

	%>
	
	
	<table border="1">
		<tr>
		    <th>Select</th>
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
				    <td><input type="radio" name="name1"/></td>
					<td><%=f.getSource()%></td>
					<td><%=f.getDestination()%></td>
					<td><%=f.getAirlines()%></td>
					<td><%=f.getPrice()%></td>

				</tr>
		<% 
			} 
		%>
	</table>
	<%
	   
	    
		}
	 
	%>
	<form action="./CustomerInfo" method="get">
	  <br><br><input type="submit" value="Book the Flight">
	</form> 
	
</body>
</html>
<%
	 }
	else
	{
		request.setAttribute("msg", "Please login First");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
%>
