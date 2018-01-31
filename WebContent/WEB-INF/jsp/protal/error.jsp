<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>websky</title>
</head>
<body>

	<div><h3>请勿非法链接！</h3></div>
	<%-- <jsp:forward page="/login.jsp"></jsp:forward> --%>
	<%
		response.sendRedirect("../login.jsp");
	%>
</html>