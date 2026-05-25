<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String username = (String)session.getAttribute("username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="name-input-servlet" method="post">
名前：<input type="text" name="username" value="<%= username != null ? username : "" %>">
<input type="submit" value="送信"> 
</form>




</body>
</html>