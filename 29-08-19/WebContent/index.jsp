<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Enter a number"%><br/>
<form action="process.jsp">
<input type="text" name="number" value="">
<input type="submit"></form>

<%="Enter details"%><br/>
<jsp:useBean id="emp" class="comm.example.model.Employee" scope="request"/>
<form method="get" action="show_data.do">
<input type="text" name="name" value="">
<input type="text" name="city" value="">
<input type="text" name="email" value="">
<input type="submit" value="Send data"><input type="reset" value="Reset">
<% 
if(request.getParameter("name") !=null)
out.println("details added");%>
</form>

</body>
</html>