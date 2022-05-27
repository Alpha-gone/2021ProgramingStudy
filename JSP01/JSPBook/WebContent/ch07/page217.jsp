<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>File Upload</title>
	</head>
	<body>
		<form action="process.jsp" method="post" enctype="multipart/form-data">
			<p>제목 : <input type="text" name="title">
			<p>파일 : <input type="file" name="filename">
			<p><input type="submit" value="업로드">
	</body>
</html>