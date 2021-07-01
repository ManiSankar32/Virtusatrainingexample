package com.Issuemanagement;

import java.io.IOException;

import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//request.getRequestDispatcher("UserMain.jsp").include(request, response);
		String Email = request.getParameter("email");
        String password = request.getParameter("password");
        HttpSession session=request.getSession();  
        
        if(Validation.checkUser(Email, password))
        {
        	session.setAttribute("email",Email);
        	RequestDispatcher dispatcher = request.getRequestDispatcher("UserMain.jsp");
            dispatcher.forward(request, response);
            String message = Email;
            response.sendRedirect("UserMain.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
        }
        else
        {
           
           RequestDispatcher rs = request.getRequestDispatcher("UserLogin.jsp");
           rs.include(request, response);
           String message = "Invalid Email or Password";
           response.sendRedirect("UserLogin.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
        }
       
 
	}

}
