package IssueManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class UserLogin {
	   
	 @SuppressWarnings("resource")
	 public static void Register(Connection conn) throws SQLException, InterruptedException{
		 Scanner scanner = new Scanner(System.in);
         final Registerdetails  register =new Registerdetails();
         System.out.print(" Enter Name => ");
         String Name = scanner.nextLine();
         register.setName(Name);
         
         System.out.print(" Enter emailId => ");
         String emailId = scanner.nextLine();
         register.setEmailId(emailId);
         
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
	     

         if(register.getPassword().equals(register.getConfpassword())) {
        	 Savedata(conn,register);
	        }
	        else {
	        	System.out.println("Password and conform password are not equal");
	        	Register(conn);
	        }
	 }
	 public static void  userlogin(Connection conn) throws SQLException, InterruptedException {
		 try  {
			 
			    Scanner scanner = new Scanner(System.in);
			    System.out.print("*** Enter Log-In Details ***");
			    System.out.println("");
			    System.out.print(" Enter Email-id => ");
	            String Email = scanner.nextLine();
	            System.out.print(" Enter password => ");
	            String password = scanner.nextLine();
                PreparedStatement st= conn.prepareStatement("select * from users where email=? and password=?");
                st.setString(1,Email);
                st.setString(2, password);
                ResultSet rs= st.executeQuery();
                if(!rs.next()) {
                	System.out.println("You entered Incorrect Email or Password ");
                    userlogin(conn);
	                   }
                else {
                	System.out.println("Success");
                	 IssueManagementUser.DisplayUser(conn,Email);
                }
                scanner.close();
                    
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
        }
	 public static boolean Savedata(Connection conn, Registerdetails register2) throws SQLException, InterruptedException {
		 
		 PreparedStatement st = conn.prepareStatement("SELECT * FROM users ORDER BY ID DESC LIMIT 1");
	        int id = 0;
	        ResultSet rs = st.executeQuery();
	        while(rs.next()) {
	        id =Integer.parseInt(rs.getString(1));
	        }
	        int no=++id;
	        String Name=register2.getName();
	        System.out.println(Name);
	        String emailid1=register2.getEmailId();
	        String gender=register2.getGen();
	        String password1=register2.getPassword();
	        String city1=register2.getCity();
	     	PreparedStatement st1 = conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
	        st1.setInt(1, no);
	     	st1.setString(2, Name);
			st1.setString(3, emailid1);
	        st1.setString(4, gender);
	        st1.setString(5, password1);
	        st1.setString(6, city1);
	        st1.execute();
	        System.out.println("Registerd succesfully");
          userlogin(conn);
		return true;
          
	 }
}



