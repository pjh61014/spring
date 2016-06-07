<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="emp.dto.MyEmpDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% MyEmpDTO userDetails  = (MyEmpDTO)request.getAttribute("user");	%>
	<form name="form1" method="post" action="read.do">
	<div align="center">
		<table width="400" border="1">
			<tr>
				<td>회원아이디</td>
				<td><input type ="hidden" name="id" value="<%=userDetails.getId() %>"><%=userDetails.getId() %>
			</tr>
			<tr>
				<td>회원패스워드</td>
				<td><input type ="hidden" name="pass" value="<%=userDetails.getPass() %>"><%=userDetails.getPass() %></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td><input type ="hidden" name="name" value="<%=userDetails.getName()%>"><%=userDetails.getName() %></td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td><input type ="hidden" name="addr" value="<%=userDetails.getAddr() %>"><%=userDetails.getAddr() %></td>
			</tr>
			<tr>
				<td>회원부서코드</td>
				<td><input type ="hidden" name="deptno" value="<%=userDetails.getDeptno() %>"><%=userDetails.getDeptno() %></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><input type ="hidden" name="grade" value="<%=userDetails.getGrade() %>"><%=userDetails.getGrade() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정하기" />
					<input type="button" value="삭제하기" onclick="location.href='delete.do?id=<%=userDetails.getId()%>'"/>
					<input type="button" value="목록보기"	onclick="location.href='member_list.do'"/>
				</td>
			</tr>
		</table>
	</div>
	</form>
</body>
</html>









