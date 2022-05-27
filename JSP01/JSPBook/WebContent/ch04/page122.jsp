<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h3>이 파일은 page122.jsp입니다.</h3>
		<jsp:useBean id="date" class="java.util.Date" />
		<p><%
			out.print("오늘의 날짜 및 시각");
			%>
		<p><%=date %>
	</body>
</html>