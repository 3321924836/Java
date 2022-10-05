<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Update</title>
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>

<body bgcolor="antiquewhite">
<div id="header">
	<ul class="headerUl">
	<li class="headerLi" onClick="JavaScript:window.location.href='list.action'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Home</div></li>
	<li class="headerLi" onClick="JavaScript:window.location.href='header02.jsp'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Album</div></li>
	<li class="headerLi" onClick="JavaScript:window.location.href='header03.jsp'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Me</div></li>
	</ul>
</div>
<center>
<div id="updateDiv">
<form action="${pageContext.request.contextPath }/update.action" method="post">
	<h3 class="words2" style="font-size: 18px">Please modify your title or your content :)</h3>
	<input type="hidden" name="id" value="${record.id }" />
	<input type="text" id="updateInput" name="title" value="${record.title}" class="words3">
	<textarea id="updateText" name="content" class="words3">${record.content}</textarea>
	<br>
	<button type="submit" id="Update" class="words2"> Update now </button>
	
</form>
</div>
</center>
</body>
</html>