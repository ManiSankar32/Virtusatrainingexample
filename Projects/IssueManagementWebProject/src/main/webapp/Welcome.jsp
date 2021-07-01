<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue Management</title>
<style>
body{
 background-color: #ddd;
}
.container{
     display:flex;
     justify-content:center;
     text-align: center;
     margin-top:12%;
}
h1{
 text-align:center;
 color:Red;
 
}
nav{
   width:25%;
   border:2px solid green;
  background: white;
  padding: 10px;
  }
  
  ul li{
    list-style-type: none;
    padding:15px; 
    
  }
  
 li a{
    border:2px solid green;
    background-color:green;
  text-decoration:none;
  color:white;
  padding:10px;
   
 }
 
</style>
</head>
<body>
<h1>Issue Management System</h1>
<div class="container">
<nav>
<ul>
     <li><a href="AdminLogin.jsp">Admin Login</a></li>
     <li><a href="UserLogin.jsp">  User Login </a></li>
     <li><a href="Register.html"> New User </a></li>
</ul>
</nav>
<p>${param.message}</p>
</div>
</body>
</html>