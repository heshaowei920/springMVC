<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>AddUser</title>
</head>
<body>
	<h2>添加角色</h2>
	<form action="${ctx}/saveRole.do" method="post">
		<table border="1">

			<tr>
				<td>角色名称：</td>
				<td><input type="text" name="roleName" value="${roleName}" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="保存" />
					<input type="button" value="返回" onclick="back();" /></td>
			</tr>
		</table>
	</form>
	<br>
	<a href="${ctx}/listRole.do">返回</a>
</body>

<script type="text/javascript">
	
	function back(){
		window.location.href="${ctx}/roleList.do";
	}
	function checkNum(num){
		var re = /^[\d]+$/;
		if(!re.test(num)){
			alert("年龄只能输入数字！")
			return false;
		}
	}
	</script>
</html>