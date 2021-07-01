<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
<head>
  <script src="./Issues.js"></script>
  <link rel="stylesheet" type="text/css" href="Style.css">
 <script>
  function func(){
	  var sub = document.getElementById("subissue");
	  var other = document.getElementById("Other");
	  if(sub==null){
		  if(other==null)
		    alert("Issue Should not be empty!");
	  }
	  
		  
  }
 </script>
 <style>     
        label{
 text-align:left;
 padding:5px;
 margin:12px 12px 12px 0px;
 display: inline-block;
  width: 30%;
}
input,select{
width:50%;
 padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
  font-weight:5px;
}
input[type=submit] {

  background-color: #4CAF50;
  color: white;
  padding: 15px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}  
.logout{
         float: inline-end;
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
    </head>
    <body>
        <nav>
            <ul>
                <li style="float:left"><a class="active" href="UserMain.jsp">Home</a></li>
                <li><a href="RegisterIssue.jsp">Register Issue</a></li>
                <li><a href="Status.jsp">Issues Status</a></li>
                <li><form action="Logout" method="get">
                  <input type="submit" value="Logout" class="logout">
                  </form>
                   </li>
              </ul>
        </nav>      
        <div class="container">
        <h2 style='text-align:center;'>Register Your Issue</h2>
        <form action="RegisterIssues" method="post">
          <div style='text-align:center;'>
       
            <label>Select Issues :</label>   <select id="Issues" name ="Issues">
                                 </select> <br><br>
            <label>Select State :</label> <select name ="subissue" id ="subissue"></select>  <br> <br>
            <label>Other Issues :</label><input type="text" id="Other" name="Other" style='width:255px;' > <br><br>
            <input type="submit" value="Submit" onclick="func()"> 
          </div>
          
          <script>
           populateIssues("Issues", "subissue"); 
            </script>  
        
        </form>
        <p>${param.message}</p>
        </div>
  
    </body>
</html>