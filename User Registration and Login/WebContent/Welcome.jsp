<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	
		
		if (request.getSession().getAttribute("email") == null) {
			
			session.invalidate();			
			response.sendRedirect("Login.jsp");
		}
	%>
	 Welcome !!
	 
	 
	<form action="<%=request.getContextPath()%>/LpgoutController"
		method="get">
		<input type="hidden" name="action" value="destroy"> <input
			type="submit" name="logout" value="Log out">
			
	</form>
</body>
</html>