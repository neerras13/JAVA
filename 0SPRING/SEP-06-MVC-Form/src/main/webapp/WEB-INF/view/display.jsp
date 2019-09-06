<%@page import="com.example.form.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>

<h1 align='center'>List of Students</h1>
<table align="center" cellpadding="10px" border="3px" style="border-collapse: collapse;">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Country</th>
			<th>Language</th>
			<th>Windows</th>
			<th>Linux</th>
			<th>Unix</th>
			<th>Edit</th>
			<th>Deletion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="r">
			<tr>
			<%! int i=0; %>
			<c:forEach items="${r}" var="entry">
				<%i=i+1;%>
				<%if(i==1){ %>
				<td name="id"><c:out value="${entry.value}"/></td>	
				<%} else {%>
				<td><c:out value="${entry.value}"/></td>
				<%} %>
			</c:forEach>
			<td><a href="">Edit</a></td>
			<td><a href="/delete">Delete</a></td>
			</tr>			
		</c:forEach>
	</tbody>
</table><br/><br/>
<a href="/student/formView">Add new employee</a>




</body>
</html>