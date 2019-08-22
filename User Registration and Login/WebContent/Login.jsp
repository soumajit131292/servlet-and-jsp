<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/Login" method="post">
		First Name:<input type="text" name="firstname" placeholder="firstname"
			required> Email:<input type="email" name="email"
			placeholder="email" required> <input type="submit"
			value="Login">
	</form>
	<a href="Registration.jsp">Click here to Register</a>
</body>
</html>