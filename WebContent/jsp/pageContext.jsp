<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 내장객체 : pageContext : 다른 내장 객체에 접근할 수 있는 객체--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.forward("info.html"); //forward() --주소줄과 보여주는 페이지가 불일치
	%>
</body>
</html>