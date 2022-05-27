<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h2>두 수의 합 출력</h2>
		<%
			String first = request.getParameter("a");
			String second = request.getParameter("b");
			
			out.println(Integer.parseInt(first)+Integer.parseInt(second));
		%>
		<p>---------plus.jsp-----------------------
	</body>
</html>