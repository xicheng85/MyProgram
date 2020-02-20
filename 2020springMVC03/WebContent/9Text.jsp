<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
作用域参数传递 <br>
${requestScope.request}<br>
${sessionScope.reqetsession}<br>
${sessionScope.session}<br>
${applicationScope.application}<br>
${map}<br>
${model}<br>
${mav} <br>
<a href="error.jsp">跳走</a>
</body>
</html>