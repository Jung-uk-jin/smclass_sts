<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터 확인</title>
		<style>
		  h2{text-align: center;}
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{text-align: center; width:400px; margin:0 auto;}
		  th,td{height:40px; }
		</style>
	</head>
	<body>
	  <h2>보드정보</h2>
	  <table>
	    <tr>
	      <th>data</th>
	      <th>제목</th>
	    </tr>
	    <tr>
	      <td>${dno }</td>
	      <td></td>
	    </tr>
	  </table>
	 
	   <div><a href="/">메인페이지 이동</a></div>
	
	</body>
</html>