<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h3>이 파일은 page123.jsp입니다.</h3>
		<jsp:useBean id="bean" class= "ch04.com.dao.Calculator" />
		<p><%
			int m = bean.process(5);
			out.println(m);
			%>
		
	</body>
</html>