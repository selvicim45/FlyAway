package org.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.dao.AdminDao;
import org.simplilearn.dao.AdminDaoImpl;
import org.simplilearn.dao.FlightsListDao;
import org.simplilearn.dao.FlightsListDaoImpl;
import org.simplilearn.entities.Airlines;

import org.simplilearn.entities.FlightsList;
import org.simplilearn.entities.SourceDestination;
import org.simplilearn.entities.User;
import org.simplilearn.services.AdminService;
import org.simplilearn.services.AdminServiceImpl;

@WebServlet(value = {"/addflights","/addairlines","/addsourcedestination","/delete","/deleteAirlines","/deleteSourceDestination","/updatepassword"})

public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminService service=new AdminServiceImpl();
	private FlightsListDao flightsdao=new FlightsListDaoImpl(); 
	private AdminDao admindao = new AdminDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//System.out.println(request.getRequestURI());
		if(request.getRequestURI().equals("/FlyAwayV2/addflights"))
		{
			//int flightno=Integer.parseInt(request.getParameter("flightno"));
			String source=request.getParameter("source");
			String destination=request.getParameter("destination");
			String airlines=request.getParameter("airlines");
			String price=request.getParameter("price");
			FlightsList f =new FlightsList();
			
		   // f.setFlightno(flightno);
			f.setSource(source);
			f.setDestination(destination);
			f.setAirlines(airlines);
			f.setPrice(price);
			
			
			if(service.insertFlights(f))
			{
			    List<FlightsList> flights=service.getflights();
				request.setAttribute("flights", flights);

				List<FlightsList> flights1=flightsdao.getAll();			
				HttpSession session=request.getSession();
				session.setAttribute("flights", flights1);					
				RequestDispatcher rd=request.getRequestDispatcher("masterflightslist.jsp");
				rd.forward(request, response);
			}
			

		}
		
		
		else if(request.getRequestURI().equals("/FlyAwayV2/addairlines"))
		{
			System.out.println(request.getRequestURI()); 
			//int airlineno=Integer.parseInt(request.getParameter("airlineno"));
			String airlinename=request.getParameter("airlineName");
			
			
		    Airlines a = new Airlines();
		      // a.setAirlineno(airlineno);
		       a.setAirlineName(airlinename);
		      
			
			
			
			if(service.insertAirlines(a))
			{
			    List<Airlines> airlines=service.getAirlines();
				request.setAttribute("airlines", airlines);

				List<Airlines> airlines1=admindao.getAllAirLines();	
				HttpSession session=request.getSession();
				session.setAttribute("airlines", airlines1);				
				RequestDispatcher rd=request.getRequestDispatcher("masterairlineslist.jsp");
				rd.forward(request, response);
	        }

		}
		else if(request.getRequestURI().equals("/FlyAwayV2/addsourcedestination"))
		{
			System.out.println(request.getRequestURI()); 
			String source=request.getParameter("source");
			String destination=request.getParameter("destination");
					
			SourceDestination sd = new SourceDestination();
			sd.setSource(source);
			sd.setDestination(destination);
			
			if (service.insertSourceDestination(sd))
			{
				List<SourceDestination> sourcedestination = service.getSourceDestination();
				request.setAttribute("sourcedestination", sourcedestination);
				

				List<SourceDestination> sourcedestination1=admindao.getAllSourceDestination();	
				HttpSession session=request.getSession();
				session.setAttribute("sourcedestination", sourcedestination1);
				
				RequestDispatcher rd=request.getRequestDispatcher("mastersourcedestinationlist.jsp");
				rd.forward(request, response);
				
				
				
			}
			
			
			
		}
		else  if(request.getRequestURI().equals("/FlyAwayV2/delete"))
			{
				response.setContentType("text/html");
				//PrintWriter out=response.getWriter();
				int flightno=Integer.parseInt(request.getParameter("flightno"));
				boolean isDeleted=service.deleteFlights(flightno);
				if(isDeleted)
				{
					List<FlightsList> flights=service.getflights();
					HttpSession session=request.getSession();
					session.setAttribute("flights", flights);
					RequestDispatcher rd=request.getRequestDispatcher("masterflightslist.jsp");
					rd.forward(request, response);
				}
			}
		
		else if(request.getRequestURI().equals("/FlyAwayV2/deleteAirlines"))
		{
			System.out.println(request.getRequestURI()); 
			response.setContentType("text/html");
			//PrintWriter out=response.getWriter();
			int airlineno=Integer.parseInt(request.getParameter("airlineno"));
			System.out.println(airlineno);
			boolean isDeleted=service.deleteAirlines(airlineno);
			if(isDeleted)
			{
				List<Airlines> airlines = service.getAirlines();
				HttpSession session=request.getSession();
				session.setAttribute("airlines", airlines);
				RequestDispatcher rd=request.getRequestDispatcher("masterairlineslist.jsp");
				rd.forward(request, response);
			}
		}
		else if(request.getRequestURI().equals("/FlyAwayV2/deleteSourceDestination"))
		{
			System.out.println(request.getRequestURI()); 
			response.setContentType("text/html");
			//PrintWriter out=response.getWriter();
			int sdno=Integer.parseInt(request.getParameter("sdno"));
			boolean isDeleted=service.deleteSourceDestination(sdno);
			if(isDeleted)
			{
				List<SourceDestination> sourcedestination=service.getSourceDestination();
				HttpSession session=request.getSession();
				session.setAttribute("sourcedestination", sourcedestination);
				RequestDispatcher rd=request.getRequestDispatcher("mastersourcedestinationlist.jsp");
				rd.forward(request, response);
			}
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI()); 
		if  (request.getRequestURI().equals("/FlyAwayV2/updatepassword"))
		{
			//int userId=Integer.parseInt(request.getParameter("userId"));
			String username= request.getParameter("username");	
		    String password= request.getParameter("newpassword");	
		
			User u = new User();
			//u.setUserId(userId);
			u.setUsername(username);
			u.setPassword(password);

			if(service.updateAdminPassword(u))			{
				request.setAttribute("msg", "Updated Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
			
	    }
	}
	}
}
	
	

	
