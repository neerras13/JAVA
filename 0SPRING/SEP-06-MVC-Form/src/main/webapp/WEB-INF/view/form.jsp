<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processView" modelAttribute="student">
First Name:<form:input path="fname"/><br/>
Last Name: <form:input path="lname"/><br/>
Email: <form:input path="email" type="email"/><br/>
Country: <form:select path="country">
<form:options items="${student.states}"/></form:select>
<pre>Favorite language: <form:radiobutton path="language" value="Java"/>Java <form:radiobutton path="language" value="C#"/>C# <form:radiobutton path="language" value="Python"/>Python</pre>
<br/>Operating Systems: 
<form:checkbox path="op" value="Linux"/>Linux
<form:checkbox path="op" value="Windows"/>Windows
<form:checkbox path="op" value="Unix"/>Unix
<input type="submit"/>
</form:form>
</body>
</html>