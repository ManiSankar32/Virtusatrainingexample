<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CriminalRecordManagment</title>
<link rel="stylesheet" href="css/uhome.css">
<link rel="stylesheet" href="js/uhome.js">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</head>
<script>
$( function(){
	$("form[id='uhome']").validate({
		
		    rules: {
			   id:{
				   required:true,
				   minlength:5
			   }
			   name:'required'
			   userName:'required'
			   password:'required'
			   address:'required'
			   email:'required'
			   phone:'required'
			   submit:'required'
			},
			messages:{
				id:'must be entered the id'
				name:'must be entered the name'
				userName:'must be entered the userName'
				password:'must be entered the password'
				address:'must be entered the address'
				email:'must be entered the email'
				phone:'must be entered the phone'
				
			}
			submitHandler: function(form){
				form.submit();
			}
			
		}
	);
}
	
);
</script>
<body>
	<div class="container">
		<h1>CriminalRecordManagment</h1>
		<div class="home">
			<a href="/">GoHome</a>
		</div>
		<div class="form">
			<form:form name="uform" action="register" method="POST"
				modelAttribute="user">
				<p>
					<label>ID</label>
					<form:input path="id" id="id" required="true" />
					<span id="id" /> <br>
				</p>
				<p>
					<label>Name</label>
					<form:input path="name" id="name" required="true" />
					<br>
				</p>
				<p>
					<label>Username</label>
					<form:input path="userName" id="userName" required="true" />
					<br>
				</p>
				<p>
					<label>Password</label>
					<form:input path="password" id="password" required="true" />
					<br>
				</p>
				<p>
					<label>Address</label>
					<form:textarea path="address" id="address" required="true" />
					<br>
				</p>
				<p>
					<label>email</label>
					<form:input path="email" id="email" required="true" />
					<br>
				</p>
				<p>
					<label>phone</label>
					<form:input path="phone" id="phone" required="true" />
					<br>
				</p>
				<p>
					<form:button value="submit">Submit</form:button>
				</p>
			</form:form>
		</div>
	</div>
	<div class="success">${status}</div>
</body>
</html>