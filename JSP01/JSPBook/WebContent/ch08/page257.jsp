<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Validation</title>
		<script type="text/javascript">
			function CheckForm(){
				alert("아이디 : " + document.loginForm.id.value + "\n" +
					  "비밀번호 : " + document.loginForm.passwd.value);
			}
		</script>
	</head>
	<body>
		<form name="loginForm">
			<p>아이디 : <input type="text" name="id">
			<p>비밀번호 : <input type="password" name="passwd">
			<p><input type="submit" value="로그인" onClick="CheckForm()">
		</form>
	</body>
</html>