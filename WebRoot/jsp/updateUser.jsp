<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>UpdateUser</title>
</head>
<body>
	<h2>更新用户</h2>
	<hr size="20" color="yellow">
	<form action="${ctx}/updateUser.do" method="post">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="name" value="${user.name}" /></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age" value="${user.age}" /></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="phone" value="${user.phone}"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="passwd" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="更新" /></td>
			</tr>
		</table>
		<input type="hidden" name="uid" value="${user.userID}" />
	</form>
</body>
</html>