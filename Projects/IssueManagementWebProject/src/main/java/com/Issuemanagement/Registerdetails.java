package com.Issuemanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registerdetails")
public class Registerdetails extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		final Register reg = new Register();
		reg.setName(request.getParameter("name"));
		reg.setEmailId(request.getParameter("email"));
		reg.setPassword(request.getParameter("password"));
		reg.setGen(request.getParameter("gender"));
		reg.setMobileno(request.getParameter("number"));
		reg.setCity(request.getParameter("city"));
		if(SaveDetails(reg)) {
			RequestDispatcher rs = request.getRequestDispatcher("UserLogin.jsp");
	        rs.include(request, response);
		}
		else {
			RequestDispatcher rs = request.getRequestDispatcher("Register.html");
	        rs.include(request, response);
		}

		
	}
	public boolean SaveDetails(Register reg){
		 try {
		Connection conn =getConnection.connection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM users ORDER BY ID DESC LIMIT 1");
        int id = 0;
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
        id =Integer.parseInt(rs.getString(1));
        }
        int no=++id;
        String Name=reg.getName();
       // System.out.println(Name);
        String emailid1=reg.getEmailId();
        String gender=reg.getGen();
        String password1=reg.getPassword();
        String mobileno=reg.getMobileno();
        String city1=reg.getCity();
     	PreparedStatement st1 = conn.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
		st1.setInt(1, no);
     	st1.setString(2, Name);
		st1.setString(3, emailid1);
        st1.setString(4, gender);
        st1.setString(5, password1);
        st1.setString(6, mobileno);
        st1.setString(7, city1);
        st1.execute();
        return true;
	
        } catch (SQLException e) {
			
			e.printStackTrace();
		}
	 return false;
	}
	

}
