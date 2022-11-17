package org.simplilearn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CustomerInfo")
public class CustomerInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		if(request.getRequestURI().equals("/FlyAwayV2/CustomerInfo"))
		{
		RequestDispatcher rd=request.getRequestDispatcher("CustomerInfo.jsp");
		rd.forward(request, response);
		}
	}

}
