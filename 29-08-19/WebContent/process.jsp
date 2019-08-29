<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.lang.Integer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a = Integer.valueOf(request.getParameter("number"));
out.println("<br/> Square of the number is:"+a*a);%>

</body>
</html>