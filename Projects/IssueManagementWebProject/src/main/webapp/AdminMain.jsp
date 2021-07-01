<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Style.css">
     </head>
     <style>
       .logout{
         
         background-color: #04AA6D;
         text-align: center;
         padding: 14px 16px;
         color: white;
         text-align: center;
       }
       form{
         margin: 0px;
       }

     </style>
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
        <h1 style="color:blue;text-align:center;">Issue Management System</h1>
         <p>Welcome to Issue Management:</p><p>${param.message}</p>
        </div>
  
    </body>
</html>