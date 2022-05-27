<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Action Tag</title>
	</head>
	<body>
		<h3>이 파일은 page131.jsp입니다.</h3>
		<jsp:useBean id="person" class= "ch04.com.dao.Person"/>
		<jsp:setProperty name="person" property="id" value="2018130113" />
		<jsp:setProperty name="person" property="name" value="홍길동"/>
		
		<%
			person.setId(20183007);
			person.setName("홍길두");
		%>
		
		<p> 아이디 : <jsp:getProperty name="person" property="id"/>
		<p> 이 름 : <jsp:getProperty name="person" property="name"/>
		
		<p> 아이디 : <%= person.getId() %>
		<p> 이 름 : <%= person.getName() %>
		
	</body>
</html>