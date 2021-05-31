package IssueManagement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public   class LoginAdmin {

       public void login() throws ClassNotFoundException, SQLException, InterruptedException {
    	   java.sql.Connection conn=null;
			//Class.forName("com.mysql.cj.jdbc.Driver");
		 //   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            if ("Mani".equals(userName) && "pass".equals(password)) {
            	System.out.println("Welcome Back Mani");  
            	IssueManagerAdmin.Display(conn);
            } else {
                System.out.println(" In valid userName of password ");
            }
        }
		
       }
       
       
}
