<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/crhome.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
     <h1>CrimeReport Form</h1>
     <div class="home">
		<a href="/">GoHome</a>
	</div>
     <div class="form">
	<form:form action="submitcrimereport" method="POST"
		modelAttribute="creport">
		
			<label>USER ID</label>
			<form:input path="userId"/>
		<<br>
		<p>
			<label>CRIME NO</label>
			<form:input path="crimeno" />
		</p><br>
		<p>
			<label>NAME OF INFORMANT</label>
			<form:textarea path="nameOfInformant" />
		</p><br>
		<p>
			<label>DETAILS OF SUSPECT</label>
			<form:textarea path="detailsOfSuspect" />
		</p><br>
		<p>
			<label>DESCRIPTION</label>
			<form:textarea path="description" />
		</p><br>
		<p>
			<label>DATE OF CREATION</label>
			<form:input path="dateC" />
		</p><br>
		<form:button value="submit">submit</form:button>
	</form:form>
	</div>
	 <div class="status">
	    ${status}
	 </div>
	 </div>
</body>
</html>