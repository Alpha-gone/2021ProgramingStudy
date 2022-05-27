<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Validation</title>
		<script type="text/javascript">
			function CheckForm(){						
				if(!isNaN(document.frm.name.value.substr(0, 1))){
					alert("이름은 숫자로 입력할 수 없습니다.");
					document.frm.name.select();
				}
			}
		</script>
	</head>
	<body>
		<form name="frm">
			<p>이름 : <input type="text" name="name">
			<p><input type="subimt" value="전송" onClick="CheckForm()">
		</form>
	</body>
</html>