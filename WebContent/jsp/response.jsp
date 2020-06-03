<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 내장객체 : response = sendRedirect()--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>response.jsp</h1>
	<%
		// 다른페이지로 이동(외부 사이트도 가능)
		//response.sendRedirect("http://www.naver.com");
	response.sendRedirect("info.html");
	%>
	
	<div>
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eligendi voluptates ipsum praesentium quibusdam totam cumque esse nesciunt laudantium quis dolorum optio fugiat necessitatibus doloribus natus facere accusantium aperiam reiciendis nulla!</p>
	</div>
</body>
</html>