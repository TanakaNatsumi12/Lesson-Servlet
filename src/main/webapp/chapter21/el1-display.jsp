<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>商品一覧</h2>

<p>
商品コード：A001<br>
商品名：${productMap["001"].name}<br>
価格：${productMap["001"].price} 円
</p>

<p>
商品コード：B002<br>
商品名：${productMap["002"].name}<br>
価格：${productMap["002"].price} 円
</p>

</body>
</html>