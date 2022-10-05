<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body bgcolor="antiquewhite">
<center>
<div id="loginDiv">
	<form action="LoginServlet" method="post">
		<h3 class="words2" style="font-size: 18px">Please login before using dailyRecord :)</h3>
		<label for="loginName"><span class="words2">username:</span></label>
		<input class="loginInput" id="loginName" type="text" name="username" autocomplete="off"></br>
		<label for="loginPsd"><span class="words2">password:</span></label>
		<input class="loginInput" id="loginPsd" type="password" name="password"></br>
		<button type="submit" id="loginButton"><span class="words2">Login</span></button>
	</form>
</div>
</center>
</body>
</html>