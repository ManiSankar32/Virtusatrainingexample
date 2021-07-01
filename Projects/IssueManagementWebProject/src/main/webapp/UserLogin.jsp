<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
 text-align:left;
 padding:5px;
 margin:12px 12px 12px 0px;
 display: inline-block;
  width: 30%;
}
input{
width:50%;
 padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}
input[type=submit] {
  text-align:center;
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
.container {
 text-align:center;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  text-align:center;
 
}
</style>
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginUser" method="post">
<label>Name:</label>
<input type="text" name="email" Required>
<label>Password:</label>
<input type="password" name="password" id="password" Required><br><br>
<input type="submit">
</form>
<p style="color:red;">${param.message}</p>
</div>
</body>
</html>