package org.simplilearn.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.dao.FlightsListDao;
import org.simplilearn.dao.FlightsListDaoImpl;
import org.simplilearn.entities.FlightsList;


@WebServlet("/home")	
public class FlightListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FlightsListDao flightsdao=new FlightsListDaoImpl(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
							
				String source=request.getParameter("source");
				String destination=request.getParameter("destination");		
				String startdate=request.getParameter("startdate");
				String enddate=request.getParameter("enddate");
				String nooftravelers=request.getParameter("nooftravelers");
				
				
				
				try {
				
					List<FlightsList> flights=flightsdao.getAll(source,destination);			
					HttpSession session=request.getSession();
					session.setAttribute("flights", flights);
					
					request.setAttribute("startdate", startdate);
					request.setAttribute("enddate", enddate);
					request.setAttribute("nooftravelers", nooftravelers);
					
					RequestDispatcher rd=request.getRequestDispatcher("flightlist.jsp");
					rd.forward(request, response);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
		

	}


