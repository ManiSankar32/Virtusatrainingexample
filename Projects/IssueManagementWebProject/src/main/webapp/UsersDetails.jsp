<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Style.css">
<style>
           
    </style>
    </head>
    <body>
      <nav>
            <ul>
                <li style="float:left"><a class="active" href="AdminMain.html">Home</a></li>
                <li><a href="UsersDetails.jsp">Registered Users</a></li>
                <li><a href="RegisteredIssues.jsp">Registered Issues</a></li>
                <li><a href="ProcessIssues.jsp">Process Issues</a></li>
                <li><a href="SolvedIssues.jsp">Issues Solved</a></li>
                <li><form action="Logout" method="get">
                  <input type="submit" value="Logout" class="logout">
                   </form>
                </li>
              </ul>
      </nav>
        <div class="container">
      <sql:setDataSource var = "snapshot" driver = "com.mysql.cj.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/issuemanagement"
         user = "user"  password = "mani@132"/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from users ORDER BY id;
      </sql:query>
      
      <table class="container1">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Mobile No</th>
            <th>City</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.gender}"/></td>
               <td><c:out value = "${row.mobileno}"/></td>
               <td><c:out value = "${row.city}"/></td>
            </tr>
         </c:forEach>
         </table>
     </div>
        
</body>
</html>