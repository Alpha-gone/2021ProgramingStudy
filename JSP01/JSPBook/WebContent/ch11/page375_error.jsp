<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isErrorPage="true" %>

<html>
	<head>
		<title>예외처리</title>
	</head>
	<body>
		<p> 잘못된 데이터가 입력되었습니다.
		<p> <%= " 숫자1 : " + request.getParameter("num1") %>
		<p> <%= " 숫자2 : " + request.getParameter("num2") %>
	</body>
</html>