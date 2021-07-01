<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/chome.css">
</head>
<body>
	<h1>Complaint Submition</h1>
	<div class="home">
		<a href="/">GoHome</a>
	</div>
     <div class="form">
	<form:form action="placecomplaint" method="POST"
		modelAttribute="complaint">
		<p>
			<label>USER ID</label>
			<form:input path="userid" />
		</p><br>
		<p>
			<label>COMPLAINT NO</label>
			<form:input path="complaintNo" />
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
			<label>DATE OF CREATE</label>
			<form:input path="datc" />
		</p><br>
		<p>
			<label>OTHERS</label>
			<form:input path="others" />
		</p><br>
		<form:button value="submit">submit</form:button>

	</form:form>
</div>
 <div class="status">
	    ${status}
	 </div>
</body>
</html>