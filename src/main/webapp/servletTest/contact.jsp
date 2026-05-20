<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="CustomerFrom.java" method="post">
<p>氏名</p>
<input type="text" name="username">
<p>会社</p>
<input type="text" name="company">
<p>メールアドレス</p>
<input type="text" name="mail">
<p>お問い合わせ内容</p>
<textarea type="textarea" name="content"></textarea>
<p>メルマガ種類</p>
<p>総合案内</p>
<input type="checkbox" name="mailmaga" value="総合案内">
<p>セミナー案内</p>
<input type="checkbox" name="mailmaga" value="セミナー案内">
<p>求人採用情報</p>
<input type="checkbox" name="mailmaga" value="求人採用情報">
<p>資料請求希望</p>
<input type="radio" name="texthope" value="Yes" value="No">
<p></p>
<input type="submit" value="送信">


</form>


</body>
</html>