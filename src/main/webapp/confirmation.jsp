<%@page import="org.simplilearn.entities.FlightsList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com</title>
</head>
<a href="login.jsp">Login Page</a><br>
<a href="home.jsp">Home Page</a><br><br>
 <%
 String sdate=request.getSession().getAttribute("startdate").toString();
 String edate=(String)request.getSession().getAttribute("enddate");
 String source=(String)request.getSession().getAttribute("source");
 String destination=(String)request.getSession().getAttribute("destination");
 String nooftravelers=(String)request.getSession().getAttribute("nooftravelers");
 
 out.println("ITINERARY");
 out.println("<BR>");

 out.println("<BR>");	 
 out.println("***********************************************************");
 out.println("<BR>"); 
 out.println("---------> Start date                : "  + sdate);
 out.println("<BR>");
 out.println("--------->  End date                 :  " +  edate);
 out.println("<BR>");
 out.println("--------->  Source                   :  " +  source);
 out.println("<BR>");
 out.println("--------->  Destination              :  " +  destination);
 out.println("<BR>");
 out.println("--------->  Total Number of Travelers : " +  nooftravelers );
 out.println("<BR>");
 out.println("***********************************************************");

 %>

<body>
 <h1>Your Tickets Booked Successfully</h1>
 <h2>Thank you for choosing Flyaway.com</h2>
</body>
</html>