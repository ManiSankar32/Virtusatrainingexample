package IssueManagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLogin {
	   
	 public static void Register(Connection conn) throws SQLException, InterruptedException {
		 Scanner scanner = new Scanner(System.in);
         final Registerdetails  register =new Registerdetails();
         System.out.print(" Enter Name => ");
         String Name = scanner.nextLine();
         register.setName(Name);
         System.out.print(" Enter emailId => ");
         String emailId = scanner.nextLine();
         register.setEmailId(Name);
         
         System.out.print(" Enter Gender => ");
         String gen = scanner.nextLine();
         register.setGen(gen);

         System.out.print(" Enter password => ");
         String password = scanner.nextLine();
         register.setPassword(password);
         
         System.out.print(" Enter Conform password => ");
         String confpassword = scanner.nextLine();
         register.setConfpassword(confpassword);

         System.out.print(" Enter City => ");
         String city = scanner.nextLine();
         register.setCity(city);
		
        if(register.getPassword()==register.getConfpassword()) {
        String Name1=register.getName();
        String emailid1=register.getEmailId();
        String gender=register.getGen();
        String password1=register.getPassword();
        String city1=register.getCity();
     	PreparedStatement st = conn.prepareStatement("insert into customers values(?,?,?,?,?)");
        st.setString(1, Name1);
		st.setString(2, emailid1);
        st.setString(3, gender);
        st.setString(4, password1);
        st.setString(5, city1);
        st.execute();
        System.out.println("Registerd succesfully");
        userlogin(conn,"");
        }
        else {
        	System.out.println("Password and conform password are not equal");
        	Register(conn);
        }
	 }
	 public static String userlogin(Connection conn,String str) throws SQLException, InterruptedException {
		 try (Scanner scanner = new Scanner(System.in)) {
	            System.out.print(" Enter Email-id => ");
	            String EmailId = scanner.nextLine();
	            System.out.print(" Enter password => ");
	            String password = scanner.nextLine();
                PreparedStatement st= conn.prepareStatement("select * from customers");
                ResultSet rs= st.executeQuery();
                while(rs.next()) {
                	
                	if(rs.getString(2).equals(EmailId) && rs.getString(4).equals(password));
	                   {
	                System.out.println("success You Log in Succesfully ");
	                IssueManagementUser.DisplayUser(conn, EmailId);
	                   }
                }
                System.out.println("You entered Incorrect Email or Password ");
                userlogin(conn,"");
	                   
                
		 }
		return null;
	 }
		
}



