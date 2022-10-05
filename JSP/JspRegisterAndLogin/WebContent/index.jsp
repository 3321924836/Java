<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>
	<%
		if (session.getAttribute("loginStatus") == null || !session.getAttribute("loginStatus").equals("Online")) {
	%>
	<h1>You are offline!</h1>
	<br>
	<a href="login.jsp"><button>login</button></a>
	<a href="register.jsp"><button>register</button></a>
	<%
		} else {
	%>
	<h1>
		You are online! Dear
		<%=session.getAttribute("cachedUsername")%>.
	</h1>
	<br>
	<a href="modify.jsp"><button>modify</button></a>
	<a href="check-exit.jsp"><button>exit</button></a>
	<%
		}
	%>
</body>
</html>