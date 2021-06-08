package IssueManagement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class IssueManagementMainPage {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
		java.sql.Connection conn=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");
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
    	 LoginAdmin la = new LoginAdmin();
    	 la.login();
     }
     
     
	}

}
