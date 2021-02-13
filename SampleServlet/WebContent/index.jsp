<%@page import="com.sample.servlet2.HelloServlet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- get the random code --%>
<b>Your code : </b>
<% out.println((Integer)request.getAttribute("data")); %>
<form method="post" action="welcome">
	<b>Please enter your name:
	<input type="text" name="urname"></b>
	<br><B>Please enter this random code for human verification : </B>
	<input type="text" name="code"><br>
	<input type="submit" value="Enter">
</form>


</body>
</html>