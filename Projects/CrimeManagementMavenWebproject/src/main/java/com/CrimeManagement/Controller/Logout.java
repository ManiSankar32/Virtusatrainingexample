package com.CrimeManagement.Controller;

import java.io.IOException;

import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");   
        
           
          
        HttpSession session=request.getSession(true);  
        System.out.println(session.getAttribute("email"));
        session.removeAttribute("email");
        session.invalidate();  
        String message = "You are successfully logged out!";
        response.sendRedirect("Login_Form.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
         
          
	}

	
}
