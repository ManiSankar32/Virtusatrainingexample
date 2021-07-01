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
 * Servlet implementation class LoginAdmin
 */
@WebServlet("/LoginAdmin")
public class LoginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
          
        String email=request.getParameter("email");  
        String password=request.getParameter("password");  
          
        if("Mani".equals(email) && "pass".equals(password)){  
        
        HttpSession session=request.getSession();  
        session.setAttribute("email",email);
        //request.getRequestDispatcher("AdminMain.html").include(request, response);
        String message = email;
        response.sendRedirect("Home.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
        }  
        else{  
        	String message = "Invalid Email or Password";
            response.sendRedirect("AdminMain.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
            request.getRequestDispatcher("UserLogin.jsp").include(request, response);  
        }  
       
	}

}
