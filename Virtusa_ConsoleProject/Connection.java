package IssueManagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


class Connection{  
public static void main(String args[]){  
 
	java.sql.Connection conn=null; 
	try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");  
System.out.println("Success");

PreparedStatement st = conn.prepareStatement("SELECT * FROM users ORDER BY ID DESC LIMIT 1");
ResultSet rs = st.executeQuery();
int id = 0;
while(rs.next()) {
id =Integer.parseInt(rs.getString(1));
}
System.out.println(++id);
conn.close();
}catch(Exception e){ System.out.println(e);}  
}


}
