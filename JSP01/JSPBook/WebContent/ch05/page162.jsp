<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Implicit Object</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String userid = request.getParameter("id");
			String password = request.getParameter("passwd");
			
			if(userid.equals("관리자") && password.equals("1234")){
				response.sendRedirect("page163_s.jsp");
			}else{
				response.sendRedirect("page163_f.jsp");
			}
		%>
		
	</body>
</html>