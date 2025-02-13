<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script >
	if("${param.chk}"=="1")){
		alert("로그인 성공")
	}
	if("${param.outChk}"=="1")){
		alert("로그아웃 성공")
	}
	
</script>
</head>
<body>	
<h2>메인</h2>
<div>섹샨확인 : ${session_id}</div>
<div>로그인확인 : ${chk}</div>
<div>로그인 : ${param.chk}</div>
<ul>
<c:if test="${session_id ==null }">
<li><a href = "member/login">로그인</a>
<li><a href = "member/member">회원가입</a>
<li><a href = "/blist">게시판</a>
<li><a href = "/member/mlist">회원정보</a>
</c:if>
<c:if test="${session_id !=null }">
<li><a href = "/member/memInfo">회원정보</a>
<li><a href = "/member/logout">로그아웃</a>
</c:if>
</ul>
</body>
</html>