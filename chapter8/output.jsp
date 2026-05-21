<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@page errorPage="error.jsp" %>


<%
request.setCharacterEncoding("UTF-8");
String username=request.getParameter("username");
int age=Integer.parseInt(request.getParameter("age"));

if(usename == null || username.isEmpty()|| age == null || age.isEmpty()){
	System.out.println("ユーザー名または年齢が正しくありません")
}
%>

i

<p>ユーザー名:<%=username %></p>
<p>年齢:<%=age %></p>

<%@include file="../footer.html" %>