<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<a href="<%= request.getContextPath() %>/exercise?order=asc">価格が安い順</a>
<a href="<%= request.getContextPath() %>/exercise?order=desc">価格が高い順</a>


</body>
</html>