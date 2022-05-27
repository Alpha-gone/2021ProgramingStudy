<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Locale, java.util.Date" %>
<%@ page import="java.text.DateFormat" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Internationalization</title>
			
	</head>
	<body>
		<%
			Locale locale = request.getLocale();
			String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date());
		%>
		<p>로케일의 날짜 형식
		<p> <%out.println(date); %>
	</body>
</html>