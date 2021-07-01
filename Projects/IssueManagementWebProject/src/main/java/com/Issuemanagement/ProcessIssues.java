package com.Issuemanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessIssues
 */
@WebServlet("/ProcessIssues")
public class ProcessIssues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email=request.getParameter("email");
		String Process=request.getParameter("remarks");
		Connection conn = getConnection.connection();
		if(Process!=null) {
		String Checked="Checked";
		String  date=String.valueOf(java.time.LocalDate.now());
		try {
		PreparedStatement st1 = conn.prepareStatement("insert into issuesSolved(name,email,issuedescription,date) select name,email,issuedescription,date from issues where email=?");
		st1.setString(1, email);
	    st1.execute();
	    PreparedStatement st = conn.prepareStatement("update issuesSolved set Status=?,SolvedDescription=?,Solveddate=? where email=?");
		st.setString(1, Checked);
		st.setString(2, Process);
		st.setString(3, date);
		st.setString(4, email);
		st.execute();
		//System.out.println("Success"); 	
	    PreparedStatement st2 = conn.prepareStatement("delete from  issues where email=?");
	    st2.setString(1, email);
	    st2.execute();
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ProcessIssues.jsp");
        dispatcher.forward(request, response);
	    System.out.println("Updated Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

}
