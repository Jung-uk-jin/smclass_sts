<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>학생성적 입력</h2>
<form action="stuinput" method="post">
<label>학번</label>
<input type="text" name="stuno"><br/>
<label>이름</label>
<input type="text" name="name"><br/>
<label>국어점수</label>
<input type="text" name="kor"><br/>
<label>영어점수</label>
<input type="text" name="eng"><br/>
<label>수학점수</label>
<input type="text" name="mat"><br/>


<input type="submit" value="학생성적입력"><br/>
</form>
<div><a href = "/">메인이동</a></div>
</body>
</html>