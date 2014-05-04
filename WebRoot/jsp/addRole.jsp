<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>AddUser</title>
	</head>
	<body>
		<h2>添加角色</h2>
		<hr size="20" color="yellow">
		<form action="${pageContext.request.contextPath}/saveRole.do" method="post">
			<table>

				<tr>
					<td>角色名称：</td>
					<td><input type="text" name="roleName" value="${roleName}"/></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="保存" /></td>
				</tr>
			</table>
		</form><br>
		<a href="${pageContext.request.contextPath}/listRole.do">返回</a>
	</body>
	
	<script type="text/javascript">
	
	
	function checkNum(num){
		var re = /^[\d]+$/;
		if(!re.test(num)){
			alert("年龄只能输入数字！")
			return false;
		}
	}
	
	
	</script>
	
	
</html>