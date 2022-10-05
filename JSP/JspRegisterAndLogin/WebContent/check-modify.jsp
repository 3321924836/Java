<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	//Get data
String cPassword = request.getParameter("cPassword");
String nPassword = request.getParameter("nPassword");

//Get the username currently in use
String username = (String) session.getAttribute("cachedUsername");
Integer storedPasswordHashCode = (Integer) application.getAttribute("passwordOf" + username);

//Check if the passwords are empty
if (cPassword == null) {
	session.setAttribute("modifyStatus", "emptyCPassword");
	response.sendRedirect("modify.jsp");
} else if (nPassword == null) {
	session.setAttribute("modifyStatus", "emptyNPassword");
	response.sendRedirect("modify.jsp");
} else {
	Integer cPasswordHashCode = (Integer) cPassword.hashCode();

	//Check if current password is correct
	if (!storedPasswordHashCode.equals(cPasswordHashCode)) {
		session.setAttribute("modifyStatus", "wrongCPassword");
		response.sendRedirect("modify.jsp");
	} else {
		Integer nPasswordHashCode = nPassword.hashCode();

		//Store and redirect
		application.setAttribute("passwordOf" + username, nPasswordHashCode);
		session.setAttribute("modifyStatus", null);
		response.sendRedirect("index.jsp");
	}
}
%>