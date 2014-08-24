<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ListUser</title>
</head>
<body>
	<h2>显示用户</h2>
	<a href="${ctx}/addRole.do">添加用户</a>
	<div>
		<table style="width: 100%" border="1" class="display" id="myTable">
			<thead>
				<tr align="center">
					<th>ID</th>
					<th>角色名称</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="role" items="${list}" varStatus="count">
					<tr>
						<td>${right.theID}</td>
						<td>${right.rightName}</td>
						<td><a
							href="${ctx}/updateRight.do?uid=${right.theID}">更新</a>
							<a
							href="${ctx}/deleteRight.do?uid=${right.theID}">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>

<script type="text/javascript">

			
		
			
</script>
</html>