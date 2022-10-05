<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	//Get data
String username = request.getParameter("username");
String password = request.getParameter("password");

//Record the username currently in use
session.setAttribute("cachedUsername", username);

//Get hash codes for passwords
Integer passwordHashCode = password.hashCode();
Integer storedPasswordHashCode = (Integer) application.getAttribute("passwordOf" + username);

//Check login and redirect
if (storedPasswordHashCode == null) {
	session.setAttribute("loginStatus", "wrongUsername");
	response.sendRedirect("login.jsp");
} else if (!storedPasswordHashCode.equals(passwordHashCode)) {
	session.setAttribute("loginStatus", "wrongPassword");
	response.sendRedirect("login.jsp");
} else {
	session.setAttribute("loginStatus", "Online");
	response.sendRedirect("index.jsp");
}
%>