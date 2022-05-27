<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h2>두 수의 합</h2>
		<jsp:forward page="plus.jsp">
			<jsp:param name="a" value="3"/>
			<jsp:param name="b" value="2"/>
		</jsp:forward>
		<p>-----------main.jsp---------------------
	</body>
</html>