<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!Doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script src="js/functions.js" type="text/javascript"></script>
<title>主页</title>
</head>
<body bgcolor="antiquewhite">
<div id="header">
	<ul class="headerUl">
	<li class="headerLi" onClick="JavaScript:window.location.href='list.action'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Home</div></li>
	<li class="headerLi" onClick="JavaScript:window.location.href='header02.jsp'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Album</div></li>
	<li class="headerLi" onClick="JavaScript:window.location.href='header03.jsp'"><div class="headerLiItem" onMouseOver="this.style='border-bottom: solid 2px #E28C1A;'" onMouseOut="this.style='border:none'">Me</div></li>
	</ul>
</div>
	<table cellspacing="10" id="mainTable" align="center">
		<tr>
		<td width="20%" id="userTd" valign="top"> 
			<center>
			<img id="Userimage" width="90%" src="img/shelley.jpg" ></img>
			<div style="height:20px"></div>
			<span class="words">Shelley  ♀</span><br>
			<div style="height:15px"></div>
			<table width="100%" class="words3">
				<tr align="center">
				<td>0</td>
				<td>0</td>
				<td>0</td>
				</tr>
				<tr align="center">
				<td width="33%">Likes</td>
				<td width="34%">forwards</td>
				<td width="33%">comments</td>
				</tr>
			</table>
			<div style="height:10px"></div>
			<div id="buttonDiv" style="width: 80%;">
				<div class="myButton" id="myButton1"><span class="words2">Follow her</span></div>
				<div class="myButton"><span class="words2">Contact her</span></div>
			</div>
			</center>
		</td>
		<td width="80%" id="commentsTd" valign="top">
			<div id="commentsHeader">
			<form action="${pageContext.request.contextPath}/add.action" method="post" id="AddForm">
					<table width="90%">
						<td valign="top" width="20%"><input type="text" id="addInput" name="title" placeholder="Title" class="words3"></td>
						<td valign="top" width="60%"><textarea id="addText" name="content" class="words3" placeholder="How's your felling now?"></textarea></td>
					</table>
					<button id="AddButton"> ＋ Write down your mind now</button>
			</form>
			</div><hr>
			
			<c:forEach items="${record }" var="dailyrecord">
			<div id="comment">
				<span id="cTitle" class="words">${dailyrecord.title}</span>
			
				<div id="moreDiv">
				<button class="moreButton" onClick="window.location.href = '${pageContext.request.contextPath}/delete.action?id=' + ${dailyrecord.id}">delete </button>
				<button class="moreButton" onClick="window.location.href = '${pageContext.request.contextPath}/ready.action?id=' + ${dailyrecord.id}">update </button>
				</div>
				
				<div style="height: 10px"></div>
				<div id="cContent" class="words2">${dailyrecord.content}</div>
				<div style="height: 5px"></div>
				<div id="cTime" class="words2">${dailyrecord.time}</div>
			</div>
			<hr>
			</c:forEach>	
		</td>
		</tr>
	</table>
</body>
</html>