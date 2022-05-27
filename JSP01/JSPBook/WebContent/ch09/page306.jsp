<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<html>
	<head>
		<title>국제화</title>
	</head>
	<body>
		<fmt:requestEncoding value="utf-8" />
		<p>--------기본 로케일--------
			<fmt:setLocale value="ko"/>
			<fmt:bundle basename="ch09.com.bundle.myBundle">
				<p>제목 : <fmt:message key="title" />
				<fmt:message key="username" var="msg" />
				<p>이름 : ${msg}
			</fmt:bundle>
			
		<p>--------영문 로케일--------
			<fmt:setLocale value="en"/>
			<fmt:bundle basename="ch09.com.bundle.myBundle">
				<p>제목 : <fmt:message key="title" />
				<fmt:message key="username" var="msg" />
				<p>이름 : ${msg}
			</fmt:bundle>
	</body>
</html>