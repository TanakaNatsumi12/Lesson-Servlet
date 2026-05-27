<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map, java.util.HashMap" %>
<%@ page import="bean.Product" %>

<%
    Product p1 = new Product();
    p1.setId(001);
    p1.setName("りんご");
    p1.setPrice(120);

    Product p2 = new Product();
    p2.setId(002);
    p2.setName("みかん");
    p2.setPrice(80);

    Map<String, Product> map = new HashMap<>();
    map.put("001", p1);
    map.put("002", p2);

    request.setAttribute("productMap", map);
%>

<jsp:forward page="el1-display.jsp" />
