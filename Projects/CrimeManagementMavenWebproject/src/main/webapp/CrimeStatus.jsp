<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My page title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="Style2.css">
   
 </head>

  <body>

    <header>
        <h1>Crime Management</h1>
      </header>
    <nav>
      <ul>
        <li><a href="Home.html">Home</a></li>
        <li><a href="#">Roles</a></li>
        <li><div class="subnav">
          <button class="subnavbtn">Manage Criminals <i class="fa fa-caret-down"></i></button>
          <div class="subnav-content">
            <a href="#company">Add Criminals</a>
            <a href="View">View Criminals</a>
          </div>
        </div> 
          </li>
          <li><div class="subnav">
            <button class="subnavbtn">Manage Crimes <i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="NewCrime.jsp">Add Crimes</a>
              <a href="ViewCrimes.jsp">View Crimes</a>
               <a href="UpdateCrimeStatus.jsp">Update Crime</a>
              <a href="CrimeStatus.jsp">Crime Status</a>
            </div>
          </div> 
        </li>
        <li>
          <div class="subnav">
            <button class="subnavbtn">Reports<i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#link1">Generate Reports</a>
              <a href="#link2">View Reports</a>
            </div>
          </div>
        </li>
        <li>
          <div class="subnav">
            <button class="subnavbtn">Complaints<i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#link1">New Complaints</a>
              <a href="#link2">Complaint Status</a>
            </div>
          </div>
        </li>
       <li>  
      <form action="Logout" class="logout">
        <button type="submit">Logout</button>
      </form>
      </li>
      </ul>
    </nav>

    <main>
    <div class="container">
    <p style="color:red;">${param.message}</p>
<%
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "CrimeManagement";
String userid = "user";
String password = "mani@132";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%> 
      <table border = "1">
         <tr>
            <th>Crime Id</th>
            <th>Criminal Id</th>
            <th>Crime Description</th>
            <th>Date</th>
            <th>Punishment</th>
         </tr>
         
         <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from CrimeStatus";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("crimeid") %></td>
<td><%=resultSet.getString("criminalid") %></td>
<td><%=resultSet.getString("description") %></td>
<td><%=resultSet.getString("date") %></td>
<td><%=resultSet.getString("Punishment") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
         </table>
   
    </div>
    </main>
     
  </body>
</html>