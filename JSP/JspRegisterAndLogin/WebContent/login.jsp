<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String loginStatus = (String) session.getAttribute("loginStatus");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="check-login.jsp" method="post">
		<label for="username">Username: </label><br> <input type="text"
			name="username"
			value="<%out.print(session.getAttribute("cachedUsername") == null ? "" : session.getAttribute("cachedUsername"));%>" /><br>
		<label for="password">Password: </label><br> <input
			type="password" name="password" /><br> <input type="submit"
			value="Login" />
	</form>
	<%
		if (loginStatus == null)
		;
	else if (loginStatus.equals("wrongUsername")) {
	%>
	<label style="color: red">Username does not exist!</label>
	<%
		} else if (loginStatus.equals("wrongPassword")) {
	%>
	<label style="color: red">Password is not correct!</label>
	<%
		}
	%>
</body>
</html>
<%
	if (session.getAttribute("loginStatus") == null || !session.getAttribute("loginStatus").equals("Online"))
	session.setAttribute("loginStatus", "Offline");
session.setAttribute("cachedUsername", null);
%>