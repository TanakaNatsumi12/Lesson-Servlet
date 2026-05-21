<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="LoginServlet">
	<div class="inputLow">
		<p>
		<input type="text" id="name" name="username" placeholder="username"/>
		</p>
	</div>
	
	<div class="inputLow">
	<p>
	<input type="password" id="passwo name="password" placeholder="password"/>
	</p>
	</div>
 
        <input type="submit" id="Login" value="Login"/>
</form>

</body>
</html>