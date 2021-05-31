package IssueManagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class IssueManagementUser extends UserLogin  {
	
	
	
	
	  public static void KnowStatus(Connection conn,String email) throws SQLException, InterruptedException {
		  PreparedStatement st = conn.prepareStatement("select * from issues"); 
		 ResultSet rs= st.executeQuery();
		 System.out.println("ok");
		  while (rs.next())
		  { 
			  if(email.equals(rs.getString(3)))
			  {
				  
		  System.out.print(" name => " + rs.getString(2)); 
		  System.out.print(" email => " + rs.getString(3)); 
		  System.out.print("   Description => " + rs.getString(4)); 
		  System.out.print(" Date => " + rs.getString(6));
		  System.out.println(" Solved Description => " + rs.getString(7));
		  System.out.println(" Status=>  "+rs.getString(8));
			  }
			  else {
				  System.out.println("You Have To Register An Issue To Get Status");
			  }
	        }
		  DisplayUser(conn,email);
	}
	  
	  
	 public static void DisplayUser(Connection conn,String email) throws InterruptedException, SQLException {
		 String value;
		 System.out.println("");
		  System.out.println("Select Options Mani");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("1.You Want To Register The Issue ");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("2.Know about the Status Of the Issue");
		  TimeUnit.SECONDS.sleep(1);
		  System.out.println("3.Logout");
		  TimeUnit.SECONDS.sleep(1);
		  Scanner sc = new Scanner(System.in);
		  String  date=String.valueOf(java.time.LocalDate.now());
		    System.out.println(date);
		  int input=sc.nextInt();
		  if(input==1) {
			  value=Chatbot2.chatbot2(conn,email,sc);
			  PreparedStatement st = conn.prepareStatement("update issues set issueDescription=?,date=? where email=?");
			  st.setString(1, value);
              st.setString(2, date);
              st.setString(2, email);
              st.execute();
			  if(value!=null) {
				  DisplayUser(conn,email);
			  }
		  }
		  else if(input==2) {
			  KnowStatus(conn,email);
			  
		  }
		  else if(input==3) {
			  System.out.println("You have Logged out successfully ! Thank You ");
			  System.exit(1);
		  }
		  
	 }

	 
         
}	
        
