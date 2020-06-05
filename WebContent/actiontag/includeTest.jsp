<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 다른 페이지를 포함시켜서 보여주기
		<%@ include file = ""%>
		
		pageContext.include("");
		
		<jsp:include page = "../jsp/header.jsp"></jsp:include>
		
	 포워딩 하기
	 	pageContextforward("");
	 	
	 	<jsp:forward page="../insert.jsp"></jsp:forward>
	 	
	 	RequestDispacher rd = request.getRequestDispatcher("");
	 	rd.forward(request, response);
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../jsp/header.jsp"></jsp:include>
	메인 페이지
	<jsp:include page="../jsp/footer.jsp"></jsp:include>	
	
	
</body>
</html>