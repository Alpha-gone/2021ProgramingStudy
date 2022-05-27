<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h3>이 파일은 page125.jsp입니다.</h3>
		<jsp:useBean id="person" class= "ch04.com.dao.Person" scope="request" />
		<p> 아이디 : <%=person.getId() %>
		<p> 이 름 : <%=person.getName() %>
	</body>
</html>