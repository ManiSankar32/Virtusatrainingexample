package com.IssueManagement.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import IssueManagement.IssueManagerAdmin;

public class IssueManagementAdmin {
 
	public static void getUsers(Connection conn) throws SQLException, InterruptedException
	{
		try {
			PreparedStatement st = conn.prepareStatement("select * from users");
			
			ResultSet rs = st.executeQuery();
			//System.out.println("m");
			while (rs.next())
					{
				System.out.print("Id:" + rs.getString(1)); 
				System.out.print("name:" + rs.getString(2)); 
				System.out.print(" email " + rs.getString(3)); 
				  System.out.print(" Gender: " + rs.getString(4)); 
			//	  System.out.print(" Password: " + rs.getString(5));
				  System.out.println(" City " + rs.getString(6));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		Display(conn);
				 	
	}
	public static boolean getIssues(Connection conn) throws SQLException, InterruptedException
	{
		try {
			PreparedStatement st = conn.prepareStatement("select * from issues ");
			
			ResultSet rs = st.executeQuery();
			//System.out.println("m");
			System.out.println("   name   " +"    Email     "+ "        description      "+ "   Priority   " + "   Date    ");

			while (rs.next())
					{
				
			         	System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4)+"     "+rs.getString(5)+"    "+rs.getString(6));
				
				}
			
				/*System.out.println("Id: "+rs.getString(1));
				System.out.print("name:" + rs.getString(2)); 
				System.out.print(" email: " + rs.getString(3)); 
				  System.out.print(" issue Description: " + rs.getString(4)); 
				  System.out.print(" Priority: " + rs.getString(5));
				  System.out.println(" Date: " + rs.getString(6));
            */		
		          	
				
		        return true;
		     }
		
			
		catch(Exception e) {
			System.out.println(e);
		}
		Display(conn);
		return false;
	}
	public static void processIssue(String email,Connection conn) throws SQLException, InterruptedException {
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Solution  for the issue:");
		String Process=sc.nextLine();
		if(Process!=null) {
		String Checked="Checked";
		String  date=String.valueOf(java.time.LocalDate.now());
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
	    System.out.println("Updated Successfully"); 	
		}
		Display(conn);
	   }
	 public static void SolvedRequests(Connection conn) throws SQLException, InterruptedException {
		  PreparedStatement st = conn.prepareStatement("select * from issuesSolved"); 
		  ResultSet rs= st.executeQuery();
		  System.out.println("ok");
		  while (rs.next())
		  { 	  	  
		  System.out.print(" name => " + rs.getString(1)); 
		  System.out.print(" email => " + rs.getString(2)); 
		  System.out.print("   Description => " + rs.getString(3)); 
		  System.out.print(" Date => " + rs.getString(4));
		  System.out.print(" Solved Description => " + rs.getString(5));
		  System.out.println(" Status=>  "+rs.getString(6));
		  System.out.print(" Date => " + rs.getString(7));
			  }
		  Display(conn);
	}
				
		
	 public static void Display(Connection conn) throws SQLException, InterruptedException
	  {
		  System.out.println("");
		  System.out.println("Select Options Mani");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("1.Want to No of Users ");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("2.How many Issues are Registered");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("3.I Want to Solve The Issue");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("4.How Many Issues Solved ");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("5.Logout");
		  TimeUnit.SECONDS.sleep(1);
		  Scanner sc= new Scanner(System.in);
		  int option=sc.nextInt();
		     if(option==1)
		     {
		    	 getUsers(conn);
		     }else if(option == 2)
		     {
		    	getIssues(conn);;
		    	 //Login;
		     }else if(option ==3) {
		    	 System.out.println("Enter Email-Id which You want To process ?-->");
				  String email = sc.nextLine();
				  if(email!=null)
		    	       processIssue(email, conn);
		     }
		     else if(option==4) {
		    	SolvedRequests(conn);
		     }
		     else if(option==5) {
		    	 System.out.println("You have been Logged out Succesfully! Have a Good Day Mani");
		    	 System.exit(1);
		     }
		     sc.close();
	  }
			
		  
}
