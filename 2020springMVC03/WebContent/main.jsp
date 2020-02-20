<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
</head>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function() {
	$.post("Menu",{"leven":0},function(data){
		var result="";
		for(var i = 0; i < data.length; i++) {
			 result += "<dl>";
			result += "<dt>" + data[i].name + "</dt>";
		}
		 result += "</dl>";
		 $("body").html(result);
	})
	
})
	</script>
<body>
</body>
</html>