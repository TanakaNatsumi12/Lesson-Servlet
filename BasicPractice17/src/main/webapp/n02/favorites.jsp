<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, beans.Favorite" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>お気に入り登録</h1>
<form action="FavoriteServlet" method="post">
名前：<input type="text" name="name">
URL:<input type="text" name="url">
<input type="submit" value="追加">
</form>

<h2>登録一覧</h2>

<form action="ClearServlet" method="post">
<input type="submit" value="クリア">
</form>

<%
    ArrayList<Favorite> list = (ArrayList<Favorite>) session.getAttribute("list");
    if (list != null) {
        for (Favorite f : list) {
%>
            <p>
                <a href="<%= f.getUrl() %>" target="_blank">
                    <%= f.getName() %>
                </a>
            </p>
<%
        }
    }
%>

</body>
</html>