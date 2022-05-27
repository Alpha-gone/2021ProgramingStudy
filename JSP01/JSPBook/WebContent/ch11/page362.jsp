<%@ page contentType="text/html;charset=utf-8" %>
<%@ page errorPage="page362_error.jsp" %>

<html>
	<head>
		<title>예외처리</title>
	</head>
	<body>

		 name 파라미터 : <%= request.getParameter("name").toUpperCase() %>
		<%
			//name 파라미터 : <%= "abc".toUpperCase()
		%>
	</body>
</html>