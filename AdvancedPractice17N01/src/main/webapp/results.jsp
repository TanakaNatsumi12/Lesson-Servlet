<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
// サーブレットから取得した Map<Question, List<Answer>>
Map<String, List<String>> responses = (Map<String, List<String>>) request.getAttribute("responses");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>アンケート結果</title>
</head>
<body>
	<h1>アンケート結果</h1>

	<%
	if (responses != null && !responses.isEmpty()) {
		for (Map.Entry<String, List<String>> entry : responses.entrySet()) {
			String question = entry.getKey();
			List<String> answers = entry.getValue();
	%>
	<h3><%=question%></h3>
	<ul>
		<%
		for (String answer : answers) {
		%>
		<li><%=answer%></li>
		<%
		}
		%>
	</ul>
	<%
	}
	} else {
	%>
	<p>まだ回答がありません。</p>
	<%
	}
	%>
</body>
</html>
