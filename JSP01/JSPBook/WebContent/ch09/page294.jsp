<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Locale"%>

<%
	response.setContentType("text/html");
	response.setHeader("Content-Language", "es");
	String title = "Espa&ntilde;ol";
%>
<!DOCTYPE html>
<html>
	<head>
		<title><% out.println(title); %></title>
			
	</head>
	<body>
		<p>Idioma : Espa&ntilde;ol</p>
		<p>&iexcl;Hola Mundo!</p>
		<p>한글</p>
	</body>
</html>