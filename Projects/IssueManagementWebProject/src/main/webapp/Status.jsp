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
</head>
<body>
<nav>
            <ul>
                <li style="float:left"><a class="active" href="UserMain.jsp">Home</a></li>
                <li><a href="RegisterIssue.jsp">Register Issue</a></li>
                <li><a href="Status.jsp">Issues Status</a></li>
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
     
     <c:set var = "email" value="${sessionScope['email']}" />
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from issuesSolved where email=?;
         <sql:param value = "${email}" />
      </sql:query>
 
      <table border = "1" class="container1">
         <tr>
            <th>Name</th>
            <th>Email Id</th>
            <th>Issue Description</th>
            <th>Date</th>
            <th>Status</th>
            <th>Issue Description</th>
            <th>Solved Date</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.issuedescription}"/></td>
               <td><c:out value = "${row.Date}"/></td>
               <td><c:out value = "${row.Status}"/></td>
               <td><c:out value = "${row.SolvedDescription}"/></td>
               <td><c:out value = "${row.solveddate}"/></td>
            </tr>
         </c:forEach>
         </table>
     </div>
</body>
</html>