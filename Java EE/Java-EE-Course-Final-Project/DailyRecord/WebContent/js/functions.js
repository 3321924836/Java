// JavaScript Document
function ready(id){
	if(window.confirm("Do yu want to update?")){
		window.location.href = "${pageContext.request.contextPath}/ready.action?id=" + id;
	}
}

function time(){
	var timeDiv=document.getElementById("cTime");
	var today=new Date();
	var hour=today.getHours();
	var minute=today.getMinutes();
	var second=today.getSeconds();
	
	timeDiv.innerHTML=(today.getMonth()+1)+"-"+today.getDate()+"-"+(today.getYear()+1900)+"&nbsp;&nbsp;&nbsp;"+hour+":"+minute+":"+second;
}