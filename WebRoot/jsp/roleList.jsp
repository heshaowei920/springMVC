<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<title>ListUser</title>
</head>
<body>
	<h2>显示用户</h2>
	<a href="${pageContext.request.contextPath}/addRole.do">添加用户</a>
	<div>
		<c:choose>
			<c:when test="${empty users}">
					尚无角色，请添加！
				</c:when>
			<c:otherwise>
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
								<td>${role.theID}</td>
								<td>${role.roleName}</td>
								<td><a
									href="${pageContext.request.contextPath}/updateRole.do?uid=${role.userID}">更新</a>|
									<a
									href="${pageContext.request.contextPath}/deleteRole.do?uid=${role.userID}">删除</a>|
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:otherwise>
		</c:choose>
	</div>
</body>

<script type="text/javascript">

			
		
			
</script>
</html>