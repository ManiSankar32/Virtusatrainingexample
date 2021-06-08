package com.IssueManagement.Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.IssueManagement.Model.IssueManagementAdmin;
import com.IssueManagement.Repository.getConnection;



public class AdminLogin {

	@SuppressWarnings("resource")
	public static boolean login() throws ClassNotFoundException, SQLException, InterruptedException {
      
     try {
    	 Connection conn = getConnection.connection();
    	 Scanner sc = new Scanner(System.in);
         System.out.print(" Enter user name => ");
         String userName = sc.nextLine();

         System.out.print(" Enter password => ");
         String password = sc.nextLine();

         if ("Mani".equals(userName) && "pass".equals(password)) {
         	System.out.println("Welcome Back Mani"); 
         	//IssueManagementAdmin.Display(conn);
         	return true;
         } else {
             System.out.println(" In valid userName of password ");
             return false;
         }
         //sc.close();
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	return false;
	
    }
}
