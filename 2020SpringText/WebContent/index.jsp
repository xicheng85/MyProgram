<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="show">显示people</a>   
		  <table>
		  	 	 <tr>
		  	 	   <th>编号</th>
		  	 	   <th>姓名</th>
		  	 	   <th>年龄</th>
		  	 	   <c:forEach items="${list}" var="peo">
		  	 	   	     <tr>
		  	 	   	        <td>${peo.id}</td>
		  	 	   	        <td>${peo.uname}</td>
		  	 	   	        <td>${peo.age}</td>
		  	 	   	     </tr>
		  	 	   </c:forEach>
		  	 	 </tr>
		  </table>
		   
</body>
</html>