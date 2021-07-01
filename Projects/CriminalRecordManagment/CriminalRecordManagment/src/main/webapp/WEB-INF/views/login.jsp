<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crime Record Managment</title>
<link rel="stylesheet" href="css/home.css">
</head>
<body>
	<h1>User Login Form</h1>
	<div class="home">
		<a href="/">GoHome</a>
	</div>

	<div class="form">
		<form:form name="loginform" action="login" 
			modelAttribute="credentials">
			<p>
				<label>UserName</label>
				<form:input path="username" required="true" />
			</p>
			<p>
				<label>Password</label>
				<form:input path="password" required="true" />
				<br>
			</p>
			<p>
				<form:button value="submit">Login</form:button>
			</p>
		</form:form>
	</div>

</body>
</html>