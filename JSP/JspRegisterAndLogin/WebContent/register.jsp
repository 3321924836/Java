<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String registerStatus = (String) session.getAttribute("registerStatus");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="check-register.jsp" method="post">
		<label for="username">Username: </label><br> <input type="text"
			name="username"
			value="<%out.print(session.getAttribute("cachedUsername") == null ? "" : session.getAttribute("cachedUsername"));%>" /><br>
		<label for="password">Password: </label><br> <input
			type="password" name="password" /><br> <input type="submit"
			value="register" />
	</form>
	<%
		if (registerStatus == null)
		;
	else if (registerStatus.equals("emptyUsername")) {
	%>
	<label style="color: red">Empty username!</label>
	<%
		} else if (registerStatus.equals("emptyPassword")) {
	%>
	<label style="color: red">Empty password!</label>
	<%
		} else if (registerStatus.equals("existingUsername")) {
	%>
	<label style="color: red">Username already exists!</label>
	<%
		}
	%>
</body>
</html>
<%
	session.setAttribute("registerStatus", null);
session.setAttribute("cachedUsername", null);
%>