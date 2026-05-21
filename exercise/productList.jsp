<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="exercise.Product" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>商品一覧</title>
</head>
<body>

<h2>商品一覧（価格順）</h2>

<p>
    <a href="<%= request.getContextPath() %>/exercise/ProductSortServlet?order=asc">価格が安い順</a>
	<a href="<%= request.getContextPath() %>/exercise/ProductSortServlet?order=desc">価格が高い順</a>
    
</p>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>商品名</th>
        <th>価格</th>
    </tr>

<%
    List<Product> list = (List<Product>) request.getAttribute("productList");
    if (list != null) {
        for (Product p : list) {
%>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getPrice() %></td>
    </tr>
<%
        }
    }
%>

</table>

</body>
</html>
