<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Internationalization</title>
			
	</head>
	<body>
		<fmt:requestEncoding value="utf-8" />
		요청 파라미터 : 
		<%
			out.println(request.getParameter("id"));
		%>
		<form method="post" action="#">
			<p>아이디 <input type="text" name="id">
			<input type="submit" value="전송">
		</form>
	</body>
</html>