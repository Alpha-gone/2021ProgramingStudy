<%@ page contentType="text/html;charset=utf-8" %>
<%@ page errorPage="page363_error.jsp" %>

<html>
	<head>
		<title>예외처리</title>
	</head>
	<body>
		<%
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			
			int c = Integer.parseInt(num1) / Integer.parseInt(num2);
			
			out.println(num1 + " / " + num2 + " = " + c);
		%>
		 
	</body>
</html>