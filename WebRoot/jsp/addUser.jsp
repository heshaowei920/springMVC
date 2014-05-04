<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>AddUser</title>
	</head>
	<body>
		<h2>添加用户</h2>
		<hr size="20" color="yellow">
		<form action="${pageContext.request.contextPath}/saveUser.do" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="userID" value="${userID}"/></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name" value="${name}"/></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><input type="text" name="age" value="${age}" onChange="checkNum(this.value)"/></td>
				</tr>
				<tr>
					<td>电话：</td>
					<td><input type="text" name="phone" value="${phone}"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="passwd" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="保存" /></td>
				</tr>
			</table>
		</form><br>
		<a href="${pageContext.request.contextPath}/listUser.do">返回</a>
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