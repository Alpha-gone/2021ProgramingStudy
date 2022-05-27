<html>
	<head>
		<title>Sum</title>
	</head>
	<body>
		<h2>Sum</h2>
		
		<%! 
			int sum(int a, int b){
				return a + b;
			}
		%>

		<% 
		out.println("2 + 3 = " + sum(2, 3));
		%>
	</body>
</html>