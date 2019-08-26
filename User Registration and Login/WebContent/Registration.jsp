<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Controllers" method="post">
		First Name:<input type="text" name="firstname" placeholder="firstname" required>
		Last Name:<input type="text" name="lastname" placeholder="lastname" required>
		Email:<input type="email" name="email" placeholder="emil" required>
		Password:<input type="password" name="password" placeholder="password" required>
		Mobile Number:<input type="textbox" name="mobilenumber"
			placeholder="mobile number" required> <input type="submit"
			value="submit">
	</form>
</body>
</html>