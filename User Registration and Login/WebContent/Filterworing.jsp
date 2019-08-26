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
if(request.getSession().getAttribute("email")==null)
{
	response.sendRedirect("Login.jsp");
}

%>
filter is working.
<a href="Welcome.jsp">click here to go welcome page</a>
</body>
</html>