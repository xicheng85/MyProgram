<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="download?filename=1.png">下载</a>
<hr>
<form action="upload"  enctype="multipart/form-data" method="post">
姓名:<input type="text" name="name" ><br>
文件<input type="file" name="file"><br>
<input type="submit" value="上传">
</form>
</body>
</html>