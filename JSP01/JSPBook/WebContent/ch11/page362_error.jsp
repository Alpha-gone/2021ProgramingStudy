<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isErrorPage="true" %>

<html>
	<head>
		<title>예외처리</title>
	</head>
	<body>
		<p> 오류가 발생했습니다.
		<p> 예외 유형 : <%= exception.getClass().getName() %>
		<p> 예외 메시지 : <%= exception.getMessage() %>
	</body>
</html>