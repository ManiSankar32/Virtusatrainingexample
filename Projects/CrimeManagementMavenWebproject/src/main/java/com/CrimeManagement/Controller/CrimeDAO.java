package com.CrimeManagement.Controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CrimeManagement.Database.SaveCrimes;
import com.CrimeManagement.Model.CrimeDetails;

/**
 * Servlet implementation class CrimeDAO
 */
@WebServlet("/CrimeDAO")
public class CrimeDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     final CrimeDetails crm = new CrimeDetails(); 
     crm.setCriminalid(request.getParameter("criminalid"));
     crm.setInformer(request.getParameter("informer"));
     crm.setSuspectDetails(request.getParameter("suspect"));
     crm.setDescription(request.getParameter("description"));
     crm.setDate(request.getParameter("date"));
     crm.setPlace(request.getParameter("place"));
     if(SaveCrimes.Savecrimes(crm)) {
    	 System.out.println("Success");
    	 RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCrimes.jsp");
         dispatcher.forward(request, response);
         String message = "Successfully Updated";
         response.sendRedirect("ViewCrimes.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
     }
     else {
        System.out.println("Insertion Failed");
     }
	}

}
