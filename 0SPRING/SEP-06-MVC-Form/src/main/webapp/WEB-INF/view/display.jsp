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
First Name is... ${st.fname}<br/>
Last Name is... ${st.lname}<br/>
Email is... ${st.email}<br/>
Country is... ${st.country}<br/>
Favourite language is... ${st.language}<br/>
OS known... 
<c:forEach items="${st.op}" var="a">
${a}<br/>
</c:forEach>



</body>
</html>