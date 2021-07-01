
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/placeCrime" method="post" modelAttribute="Crimes">  
        CriminalId: <form:input path="Criminalid" />         
        <br><br>  
        Informer: <form:input path="Informer" />  
        <br><br>  
        SuspectDetails: <form:input path="SuspectDetails" />         
        <br><br>  
        Description: <form:input path="Description" />  
        <br><br>
        date: <form:input path="Date" />         
        <br><br>  
        Place: <form:input path="Place" />  
        <br><br>
        
        <input type="submit" value="Submit" />      
    </form:form>  
</body>
</html>