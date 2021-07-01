package com.CrimeManagement.Controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CrimeManagement.Database.SaveCrimes;
import com.CrimeManagement.Model.Crime2;

public class UpdateCrimeStatus {
private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    final Crime2 crm = new Crime2();
	    crm.setCrimeid(Integer.parseInt(request.getParameter("crimeid")));
	    crm.setCriminalid(request.getParameter("criminalid"));
	    crm.setDate(request.getParameter("date"));
	    crm.setPunishment(request.getParameter("punishment"));
		if(SaveCrimes.UpdateCrimeStatus(crm)) {
			System.out.println("Updated Successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("CrimeStatus.jsp");
            dispatcher.forward(request, response);
            String message = "Succesfully Updated";
            response.sendRedirect("CrimeStatus.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
		}else {
			System.out.println("error");
		}
	}
	
}
