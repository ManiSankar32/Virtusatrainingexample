<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My page title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="Style2.css">
   
 </head>

  <body>

    <header>
        <h1>Crime Management</h1>
      </header>
    <nav>
      <ul>
        <li><a href="Home.html">Home</a></li>
        <li><a href="#">Roles</a></li>
        <li><div class="subnav">
          <button class="subnavbtn">Manage Criminals <i class="fa fa-caret-down"></i></button>
          <div class="subnav-content">
            <a href="#company">Add Criminals</a>
            <a href="View">View Criminals</a>
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
   
 
     
 
      <table border = "1">
         <tr>
            <th>Crime Id</th>
            <th>Criminal Id</th>
            <th>Informer</th>
            <th>Suspect Details</th>
            <th>Crime Description</th>
            <th>Date Of Crime</th>
            <th>Place</th>
         </tr>
         
         <c:forEach var = "Crimes" items = "${listcrimes}">
            <tr>
               <td><c:out value = "${Crimes.Crimeid}"/></td>
               <td><c:out value = "${Crimes.Criminalid}"/></td>
               <td><c:out value = "${Crimes.Informer}"/></td>
               <td><c:out value = "${Crimes.SuspectDetails}"/></td>
               <td><c:out value = "${Crimes.Description}"/></td>
               <td><c:out value = "${Crimes.Date}"/></td>
               <td><c:out value = "${Crimes.Place}"/></td>
            </tr>
         </c:forEach>
         </table>
   
  
    </main>
     
  </body>
</html>