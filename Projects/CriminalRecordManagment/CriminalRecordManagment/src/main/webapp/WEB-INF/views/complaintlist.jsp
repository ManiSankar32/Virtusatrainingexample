<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="home">
		<a href="/">GoHome</a>
	</div>
	<table border="1" class="table table-bordered">
		<thead>
			<tr>
				<td>USER ID</td>
				<td>COMPLAINT NO</td>
				<td>DETAILS OF SUSPECT</td>
				<td>DESCRIPTION</td>
				<td>DATE CREATE</td>
				<td>OTHERS</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="c" items="${usercomplaints}">
			<tr>
					<td><c:out value="${c.userid}" /></td>
					<td><c:out value="${c.complaintNo}" /></td>
					<td><c:out value="${c.detailsOfSuspect}" /></td>
					<td><c:out value="${c.description}" /></td>
					<td><c:out value="${c.datc}" /></td>
					<td><c:out value="${c.others}" /></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>