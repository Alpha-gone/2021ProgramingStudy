<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<html>
<head>
<title>국제화</title>
</head>
<body>
<fmt:requestEncoding value="utf-8" />
	<fmt:setBundle var="me" basename="resourceBundle.message"  />
		<p><fmt:message bundle="${message}" key="name" />
			<fmt:message bundle="${message}" key="hello" var="msg" />
		<p>${msg}
</body>
</html>