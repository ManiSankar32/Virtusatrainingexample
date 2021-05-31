package IssueManagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IssueManagerAdmin extends LoginAdmin {
    
	public static void getUsers(Connection conn) throws SQLException, InterruptedException
	{
		try {
			PreparedStatement st = conn.prepareStatement("select * from customers");
			
			ResultSet rs = st.executeQuery();
			//System.out.println("m");
			while (rs.next())
					{
				System.out.print("name:" + rs.getString(1)); 
				System.out.print(" email " + rs.getString(2)); 
				  System.out.print(" Gender: " + rs.getString(3)); 
			//	  System.out.print(" Password: " + rs.getString(4));
				  System.out.println(" City " + rs.getString(5));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		Display(conn);
				 	
	}
	public static void getIssues(Connection conn) throws SQLException, InterruptedException
	{
		try {
			PreparedStatement st = conn.prepareStatement("select * from issues ");
			
			ResultSet rs = st.executeQuery();
			//System.out.println("m");
			System.out.println("Id   " + "   name   " +"    Email     "+ "        description      "+ "   Priority   " + "   Date    ");

			while (rs.next())
					{
				if(rs.getString(5).equals("high")) {
			         	System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4)+"     "+rs.getString(5)+"    "+rs.getString(6));
				
				}
			while (rs.next())
				{
			if(rs.getString(5).equals("medium")) {
		         	System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4)+"     "+rs.getString(5)+"    "+rs.getString(6));
			
			                  }
				/*System.out.println("Id: "+rs.getString(1));
				System.out.print("name:" + rs.getString(2)); 
				System.out.print(" email: " + rs.getString(3)); 
				  System.out.print(" issue Description: " + rs.getString(4)); 
				  System.out.print(" Priority: " + rs.getString(5));
				  System.out.println(" Date: " + rs.getString(6));
            */		
		          	}
			
	         }
		}
			
		catch(Exception e) {
			System.out.println(e);
		}
		Display(conn);
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
	    st.setString(1, email);
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
		    	 IssueManagerAdmin.getUsers(conn);
		     }else if(option == 2)
		     {
		    	 IssueManagerAdmin.getIssues(conn);;
		    	 //Login;
		     }else if(option ==3) {
		    	 System.out.println("Enter Email-Id which You want To process ?-->");
				  String email = sc.nextLine();
				  if(email!=null)
		    	       IssueManagerAdmin.processIssue(email, conn);
		     }
		     else if(option==4) {
		    	 IssueManagerAdmin.SolvedRequests(conn);
		     }
		     else if(option==5) {
		    	 System.out.println("You Have benn Logged out Succesfully! Have a Good Day Mani");
		    	 System.exit(1);
		     }
	  }
	
	
//	public static void main(String args[]) throws SQLException, ClassNotFoundException {
//	 	 Scanner sc =new Scanner(System.in);
//		java.sql.Connection conn=null;
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");
//		//   getUsers(conn);
//		    getIssues(conn);
//		  System.out.println("Enter Id which You want To process ?-->");
//		  String email = sc.nextLine();
//		  SolvedRequests(conn,"");
//		//  getIssues(conn);
//	} 
//		
		  
	}

