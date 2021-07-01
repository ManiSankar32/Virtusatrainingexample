package com.Issuemanagement;

import java.sql.Connection;
import java.sql.DriverManager;


public class getConnection {
	public static Connection connection()
	{ 
		Connection conn=null; 
		try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");  
	System.out.println("Success");
	
    return conn;
	}
		catch(Exception e){ System.out.println(e);}
		return conn; 
   
}
}

