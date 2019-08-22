<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/Controllers" method="post">
		First Name:<input type="text" name="firstname" placeholder="firstname">
		Last Name:<input type="text" name="lastname" placeholder="lastname">
		Email:<input type="email" name="email" placeholder="emil">
		Password:<input type="password" name="password" placeholder="password">
		Mobile Number:<input type="number" name="mobilenumber"
			placeholder="mobile number"> <input type="submit"
			value="submit">
	</form>
</body>
</html>