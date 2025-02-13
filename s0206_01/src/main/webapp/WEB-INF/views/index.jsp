<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>메인페이지</h2>
<h4>섹션 : ${session_id} }</h4>
<c:if test="${session_id }"
<div><a href = "login">로그인</a></div>
<div><a href = "member">회원가입</a></div>
<div><a href = "logout">로그아웃</a></div>
<div><a href = "meminfo">회원정보</a></div>
<div><a href = "loginfo">로그인회원정보</a></div>

</body>
</html>