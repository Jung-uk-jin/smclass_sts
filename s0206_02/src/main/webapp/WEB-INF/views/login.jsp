<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<h2>로그인</h2>
<form action="login" method="post">
<label>아이디</label>
<input type="text" name="id"><br/>
<label>패스워드</label>
<input type="password" name="pw"><br/>
<label>국어점수</label>
<input type="text" name="kor"><br/>
<label>영어점수</label>
<input type="text" name="eng"><br/>
<label>수학점수</label>
<input type="text" name="mat"><br/>


<input type="submit" value="로그인"><br/>
</form>
<div><a href = "/">메인이동</a></div>
</body>
</html>