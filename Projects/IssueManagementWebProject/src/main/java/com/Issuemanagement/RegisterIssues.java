package com.Issuemanagement;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterIssues")
public class RegisterIssues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String issue=request.getParameter("subissue");
	 System.out.println(issue);
	 try {
	 String  date=String.valueOf(java.time.LocalDate.now());
	  String name = null;
	  //(String) request.getAttribute("email")
		String email="siva";
		Connection conn = getConnection.connection();
		PreparedStatement st1 = conn.prepareStatement("select * from users");
		ResultSet rs =st1.executeQuery();
     while(rs.next()) {
     	if(email.equals(rs.getString(2))) {
     		name=rs.getString(1);
     	}
     }
     System.out.println(name);
     PreparedStatement st = conn.prepareStatement("insert into issues(name,email,issuedescription,priority,date)values(?,?,?,?,?)");
     st.setString(1, name);
     st.setString(2, email);
	 st.setString(3, issue);
     st.setString(4, "High");
     st.setString(5, date);
     st.execute();
     String message = "Your Issue Registered Succesfully";
     response.sendRedirect("RegisterIssue.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
