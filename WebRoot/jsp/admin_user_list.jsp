<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css">
body {
	background-color: #D2E9FF;
}

a:visited {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #005AB5;
}
</style>

<title>ListUser</title>
</head>
<body>
	<h5 style="color: #005AB5;">当前位置：系统管理&gt;&gt;用户管理</h5>

	<div>
		<table border="1" width="100%" style="BORDER-COLLAPSE: collapse"
			cellPadding=1 borderColor="#a3a3a3">
			<thead>
				<tr align="center" style="background-color: #46A3FF">
					<th>用户名</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>电话</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="user" items="${users}" varStatus="count">
					<tr>
						<td>${user.userID}</td>
						<td>${user.name}</td>
						<td>${user.age}</td>
						<td>${user.phone}</td>
						<td><a href="${ctx}/toUpdateUser.do?uid=${user.userID}">修改</a>
							<a href="${ctx}/deleteUser.do?uid=${user.userID}">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>