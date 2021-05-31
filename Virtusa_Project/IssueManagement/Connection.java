package IssueManagement;

import java.sql.DriverManager;


class Connection{  
public static void main(String args[]){  
 
	java.sql.Connection conn=null; 
	try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");  
System.out.println("Success");


conn.close();
}catch(Exception e){ System.out.println(e);}  
}


}
