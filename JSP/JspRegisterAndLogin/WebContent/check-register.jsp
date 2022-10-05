<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	//Get data
String username = request.getParameter("username");
String password = request.getParameter("password");

//Record the username currently in use
session.setAttribute("cachedUsername", username);

//Check if data is empty
if (username.isEmpty()) {
	session.setAttribute("registerStatus", "emptyUsername");
	response.sendRedirect("register.jsp");
} else if (password.isEmpty()) {
	session.setAttribute("registerStatus", "emptyPassword");
	response.sendRedirect("register.jsp");
}
//Check if the username already exists
else if (application.getAttribute("passwordOf" + username) != null) {
	session.setAttribute("registerStatus", "existingUsername");
	response.sendRedirect("register.jsp");
} else {
	//Get hash codes for passwords
	Integer passwordHashCode = password.hashCode();

	//Store and redirect
	application.setAttribute("passwordOf" + username, passwordHashCode);
	session.setAttribute("registerStatus", null);
	response.sendRedirect("login.jsp");
}
%>