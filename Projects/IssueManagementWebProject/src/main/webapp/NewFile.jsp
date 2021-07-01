<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>

<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
          
      Connection  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuemanagement","user","mani@132");  
           Statement statement = conn.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from users") ;
       %>
      <TABLE BORDER="1">
      <TR>
      <TH>ID</TH>
      <TH>Name</TH>
      <TH>City</TH>
      <TH>State</TH>
      <TH>Country</TH>
      <TH>Email</TH>
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       <TD> <%= resultset.getString(6) %></TD>
      </TR>
      <% } %>
     </TABLE>
</body>
</html>