<%@ page contentType="text/html; charset=utf-8" %>
<%@ page isELIgnored="true" %>
<html>
	<head>
		<title>Directives Tag</title>
	</head>
	<body>
		<%
			request.setAttribute("Univ", "대림대학교");
		%>
		${requestScope.Univ}
	</body>
</html>