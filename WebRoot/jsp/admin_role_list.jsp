<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<html>
<head>
<title>ListUser</title>
</head>
<body>
	<h2>显示用户</h2>
	<a href="${ctx}/addRole.do">添加用户</a>
	<div>
		<table style="width: 100%" border="1">
			<thead>
				<tr align="center">
					<th>ID</th>
					<th>角色名称</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="role" items="${list}">
					<tr>
						<td>${role.theID}</td>
						<td>${role.roleName}</td>
						<td><a href="${ctx}/updateRole.do?uid=${role.theID}">更新</a>|
							<a href="${ctx}/deleteRole.do?uid=${role.theID}">删除</a>|</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

<script type="text/javascript">

			
		
			
</script>
</html>