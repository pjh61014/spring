<%@page import="emp.dto.MyEmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%if(session.isNew()) %>
</head>
<body>
	<div>
		<h1>메인페이지</h1>
		
		<hr/>
		<h3><a href="test.do">스프링 웹 MVC연동하기</a></h3>
		<h3><a href="insert.do">회원가입</a></h3>
		<h3><a href="list.do">회원목록보기</a></h3>
		<h3><a href="search.do">회원검색(검색액션:/search)</a></h3>
		<h3><a href="board_list.do">게시판</a></h3>
				
	</div>
	
	<a href="login.do" class="btn btn-success active">로그인<i class="icon-ok icon-white"></i></a>
</body>
</html>












