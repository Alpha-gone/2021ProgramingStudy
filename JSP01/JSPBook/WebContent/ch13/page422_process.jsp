<%@ page contentType="text/html;charset=utf-8" %>

<html>
	<head>
		<title>Session</title>
	</head>
	<body>
		<%
			String user_id = request.getParameter("id");
			String user_password = request.getParameter("passwd");
			
			if(user_id.equals("admin") && user_password.equals("1234")){
				session.setAttribute("userID", user_id);
				session.setAttribute("userPW", user_password);
				session.setAttribute("test", "테스트 성공");
				out.println("세션 설정이 성공했습니다.<br>");
				out.println(user_id + "님 환영합니다.<br>");
				
				out.println("설정된 세션의 속성 값 [1] : " + (String)session.getAttribute("userID") + "<br>");
				out.println("설정된 세션의 속성 값 [2] : " + (String)session.getAttribute("userPW") + "<br>");
				out.println("접속자의 세션 키 : " + session.getId() + "<br>");
				session.setMaxInactiveInterval(1);
				out.println("세션 유효 시간(초) : " +session.getMaxInactiveInterval() + "<br>");
			} else{
				out.println("세션 설정이 실패했습니다.");
			}
		%>
		 
	</body>
</html>