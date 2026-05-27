<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="beans.Tweet" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイート一覧</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<div class="container">
		<h1>ツイート一覧</h1>
		<%-- 新規投稿 --%>
		<p>
			<a href="new_tweet.jsp">新規投稿</a>
		</p>

		<%-- ツイート一覧の表示 --%>
		<ul class="tweet-list">
			<li>
				<div class="tweet-content">
<!--					<p>content（ツイート内容）</p>-->
<!--					<p class="tweet-info">投稿者: author - 投稿日時: posted_at</p>-->

						<p>
						${tweets.content}
						${tweets.author}
						${tweets.posted_at}
						${tweets.getContent()}
						${param.content}
						${param.author}
						</p>
						
						
						<% Tweet t=(Tweet)request.getAttribute("tweets") %>
						<%t.getContent() %>:<%t.getAuthor() %>:<%t.getPostAt() %>
						
						<jsp:useBean id="tweets" class="beans.Tweet" />
						<p>
						<jsp:getProperty name="tweets" property="id" />:
						<jsp:getProperty name="tweets" property="content" />:
						<jsp:getProperty name="tweets" property="posteAt" />:
						<jsp:getProperty name="tweets" property="author" />
						</p>
						
						
				</div>
			</li>
		</ul>
	</div>
</body>
</html>
