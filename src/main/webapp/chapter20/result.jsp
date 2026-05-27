<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="product" class="bean.Product" scope="request" />
<jsp:setProperty name="product" property="*" />

<h1>入力された商品情報</h1>

<p>
商品ID：<jsp:getProperty name="product" property="id" /><br>
商品名：<jsp:getProperty name="product" property="name" /><br>
価格：<jsp:getProperty name="product" property="price" />円<br>
</p>


</body>
</html>