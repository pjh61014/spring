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
	<div align="center">
		<table width="400" border="1">
			<tr>
				<td>ȸ�����̵�</td>
				<td><%=userDetails.getId() %></td>
			</tr>
			<tr>
				<td>ȸ���н�����</td>
				<td><%=userDetails.getPass() %></td>
			</tr>
			<tr>
				<td>ȸ������</td>
				<td><%=userDetails.getName() %></td>
			</tr>
			<tr>
				<td>ȸ���ּ�</td>
				<td><input type= id=""><%=userDetails.getAddr() %></td>
			</tr>
			<tr>
				<td>ȸ���μ��ڵ�</td>
				<td><%=userDetails.getDeptno() %></td>
			</tr>
			<tr>
				<td>���</td>
				<td><%=userDetails.getGrade() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�����ϱ�" onclick="location.href='update.do?id=<%=userDetails.getId()%>&name=<%=userDetails.getName()%>'"/>
					<input type="button" value="�����ϱ�"/>
					<input type="button" value="��Ϻ���"
						onclick="location.href='member_list.do'"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>









