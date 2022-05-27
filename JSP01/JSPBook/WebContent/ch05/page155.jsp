<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Implicit Object</title>
	</head>
	<body>
		<%
			Enumeration en =  request.getHeaderNames();
			
			while(en.hasMoreElements()){
				String headerName = (String)en.nextElement();
				String headerValue = request.getHeader(headerName);
				out.println(headerName + " : " + headerValue + "<br>");
			}
		%>
	</body>
</html>