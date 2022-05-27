<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Validation</title>
		<script type="text/javascript">
			function CheckMember(){						
				var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[0-9a-zA-Z]{2,3}$/i;
				var f= document.Member;
				
				if(!regExpEmail.test(f.email.value)){
					alert("이메일 입력을 확인 해주세요");
					return;
				}
			}
		</script>
	</head>
	<body>
		<form name="Member" method="post">
			<p>이메일 : <input type="text" name="email">
			<p><input type="button" value="가입하기" onClick="CheckMember()">
		</form>
	</body>
</html>