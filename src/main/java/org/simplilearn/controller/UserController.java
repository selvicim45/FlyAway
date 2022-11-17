package org.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.entities.User;
import org.simplilearn.services.UserService;
import org.simplilearn.services.UserServiceImpl;

@WebServlet(value = {"/login","/register"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserService userService=new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		if(request.getRequestURI().equals("/FlyAwayV2/login"))
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String userType=request.getParameter("usertype");
			
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setUserType(userType);
			User user1=userService.validate(user);
			
			
			if (user1!=null)
			{
			   HttpSession session=request.getSession();
			   session.setAttribute("user", user1);	
			   System.out.println(userType);	
			   if (userType.equals("admin"))
			   {		
				
				RequestDispatcher rd=request.getRequestDispatcher("adminpage.jsp");
				rd.forward(request, response);
				
			    }
				
			    else if (userType.equals("user"))
			    {
								
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			    }
			}
		   	else
		   	{  
		   		
				request.setAttribute("msg", "Username/Password is wrong");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}
		
		
	
	
	if(request.getRequestURI().equals("/FlyAwayV2/register"))
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String userType=request.getParameter("usertype");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType(userType);
		if(userService.registerUser(user))
		{
			request.setAttribute("msg", "Registered Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		out.close();
	}
}



}
