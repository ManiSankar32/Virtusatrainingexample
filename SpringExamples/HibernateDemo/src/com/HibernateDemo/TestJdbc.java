package com.HibernateDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
String jdbcurl = "jdbc:mysql://localhost:3306/issuemanagement?useSSL=false&serverTimeZone=UTL";
String user="user";
String pass="mani@132";
try {
System.out.println("Connecting"+jdbcurl);
Connection myConn=DriverManager.getConnection(jdbcurl,user,pass);
System.out.println("Connectrion Succes");
}catch(Exception e) {
	e.printStackTrace();
}
	}
}

