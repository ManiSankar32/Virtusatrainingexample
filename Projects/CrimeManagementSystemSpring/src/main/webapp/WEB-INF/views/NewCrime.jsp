<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>My page title</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="Style2.css">
<style>

label{
 text-align:left;
 padding:5px;
 margin:12px 12px 12px 0px;
 display: inline-block;
  width: 30%;
  font-size:15px;
}
input,select{
  width:30%;
 padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}
#submit{
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
</head>
<body>
 <header>
        <h1>Crime Management</h1>
      </header>
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Roles</a></li>
        <li><div class="subnav">
          <button class="subnavbtn">Manage Criminals <i class="fa fa-caret-down"></i></button>
          <div class="subnav-content">
            <a href="#company">Add Criminals</a>
            <a href="#team">View Criminals</a>
          </div>
        </div> 
          </li>
          <li><div class="subnav">
            <button class="subnavbtn">Manage Crimes <i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="NewCrime.jsp">Add Crimes</a>
              <a href="ViewCrimes.jsp">View Crimes</a>
            </div>
          </div> 
        </li>
        <li>
          <div class="subnav">
            <button class="subnavbtn">Reports<i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#link1">Generate Reports</a>
              <a href="#link2">View Reports</a>
            </div>
          </div>
        </li>
        <li>
          <div class="subnav">
            <button class="subnavbtn">Complaints<i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="#link1">New Complaints</a>
              <a href="#link2">Complaint Status</a>
            </div>
          </div>
        </li>
       <li>  
      <form class="logout">
        <button type="submit">Logout</button>
      </form>
      </li>
      </ul>
    </nav> 
<main>
<h2>Register details</h2>
<form action="placeCrime" method="post">
<label for="name">Criminal Id:</label>
<input type="text" name="criminalid" id="name" required><br><br>
<label for="informer">Informer:</label>
<input type="text" name="informer" id="informer" required><br><br>
<label for="suspect">Suspect Details</label>
<input type="text" name="suspect" id="suspect" required><br><br>
<label for="description">Description:</label>
<input type="text" name="description" id="description" required><br><br>
<label>Date:</label>
<input type="date"  id="date" name="date"><br><br>
<label for="place">Place:</label>
<input type="text" name="place" id="place" required><br><br>
<input type="submit" id="submit">
</form>
</main>
</body>
</html>