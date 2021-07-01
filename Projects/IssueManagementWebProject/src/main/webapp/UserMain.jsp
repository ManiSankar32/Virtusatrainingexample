<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
      <link rel="stylesheet" type="text/css" href="Style.css">
    </head>
    <style>
       
       form{
         margin: 0px;
       }

     </style>
    <body>
        <nav>
            <ul>
                <li style="float:left"><a class="active" href="UserMain.jsp">Home</a></li>
                <li><a href="RegisterIssue.jsp">Register Issue</a></li>
                <li><a href="Status.jsp">Issues Status</a></li>
                <li><form action="Logout" method="post">
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