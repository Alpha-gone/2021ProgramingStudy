<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<html>
	<head>
		<title>국제화</title>
	</head>
	<body>
		<fmt:requestEncoding value="utf-8" />
			<fmt:bundle basename="resourceBundle.message">
				<p><fmt:message key="name" />
				<fmt:message key="hello" var="msg" />
				<p>${msg}
			</fmt:bundle>
	</body>
</html>