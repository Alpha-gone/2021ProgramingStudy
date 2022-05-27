<%@ page contentType="text/html;charset=utf-8" %>

<html>
	<head>
		<title>예외처리</title>
	</head>
	<body>
		<%
			try{
				String num1 = request.getParameter("num1");
				String num2 = request.getParameter("num2");
				
				int c = Integer.parseInt(num1) / Integer.parseInt(num2);
				
			}catch(NumberFormatException e){
				RequestDispatcher dispatcher = request.getRequestDispatcher("page375_error.jsp");
				dispatcher.forward(request, response);
			}catch(ArithmeticException e){
				RequestDispatcher dispatcher = request.getRequestDispatcher("page375_error.jsp");
				dispatcher.forward(request, response);
			}
			
		%>
		 
	</body>
</html>