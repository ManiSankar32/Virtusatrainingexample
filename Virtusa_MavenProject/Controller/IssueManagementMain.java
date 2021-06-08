package com.IssueManagement.Controller;

import com.IssueManagement.Repository.getConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;



public class IssueManagementMain {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
			// TODO Auto-generated method stub
		Connection conn =getConnection.connection();
		 System.out.println("Welcome To Issue Manangemet");
		 System.out.println("1.New User");
		 System.out.println("2.Existed User");
		 System.out.println("3.Admin");
	     Scanner sc = new Scanner(System.in);
	     int option=sc.nextInt();
	     if(option==1)
	     {
	    	 UserLogin.Register(conn);
	     }else if(option ==2)
	     {
	    	 UserLogin.userlogin(conn);
	     }else if(option ==3) {
	    	 AdminLogin.login();
	     }
	     sc.close();
	     
	}

}
