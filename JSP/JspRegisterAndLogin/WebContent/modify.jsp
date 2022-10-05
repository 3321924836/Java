<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String modifyStatus = (String) session.getAttribute("modifyStatus");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Modify</title>
</head>
<body>
	<h1>Modify Page</h1>
	<form action="check-modify.jsp" method="post">
		<label>Username: </label><br> <label>
			<%
				out.print(session.getAttribute("cachedUsername") == null ? "" : session.getAttribute("cachedUsername"));
			%>
		</label><br> <label for="cPassword">Current Password: </label><br> <input
			type="password" name="cPassword" /><br> <label for="nPassword">New
			Password: </label><br> <input type="password" name="nPassword" /><br>
		<input type="submit" value="Modify" />
	</form>
	<%
		if (modifyStatus == null)
		;
	else if (modifyStatus.equals("emptyCPassword")) {
	%>
	<label style="color: red">Current password is empty!</label>
	<%
		} else if (modifyStatus.equals("emptyNPassword")) {
	%>
	<label style="color: red">New password is empty!</label>
	<%
		} else if (modifyStatus.equals("wrongCPassword")) {
	%>
	<label style="color: red">Current password is not correct!</label>
	<%
		}
	%>
</body>
</html>
<%
	session.setAttribute("modifyStatus", null);
%>