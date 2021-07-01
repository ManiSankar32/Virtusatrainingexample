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
            <a href="#team">View Criminals</a>
          </div>
        </div> 
          </li>
          <li><div class="subnav">
            <button class="subnavbtn">Manage Crimes <i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
              <a href="NewCrime.jsp">Add Crimes</a>
              <a href="ViewCrimes.jsp">View Crimes</a>
              <a href="UpdateCrimeStatus.jsp">Update Crime</a>
              <a href="CrimeStatus.jsp">Crime Status</a>
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
      <form action="Logout" class="logout">
        <button type="submit">Logout</button>
      </form>
      </li>
      </ul>
    </nav>

    <main>
    <h2>Welcome to Crime Management</h2>
    <h3 style="color:red;">${param.message}</h3>
    </main>
     
  </body>
</html>
<!-- Example single danger button -->
