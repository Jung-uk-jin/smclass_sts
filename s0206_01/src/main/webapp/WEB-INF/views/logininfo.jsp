<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{text-align: center;}
	table,th,td{border: 1px solid black; border-collapse: collapse;}
	table{text-align: center; width: 800px;}
	th,hd{height: 40px}
</style>
</head>
<body>
	<h2>가입회원정보</h2>
	<table>
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>
		<tr>
			<td>${id}</td>
			<td>${pw}</td>

		</tr>
	</table>

</body>
</html>