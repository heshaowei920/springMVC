<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.3b1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.tablesorter.js"></script>
<script type="text/javascript">
			function ajaxUser(){
				getResponseJson();
				$("#name").val("");
				$("#age").val("");
				$("#phone").val("");
			}
			
			function getResponseJson(){
				var param = "name="+$('#name').val()+"&age="+$('#age').val()+"&phone="+$('#phone').val()+"";
				var url = "ajaxGetUser.do?"+param;
				//alert(param);
				$.getJSON(url, function(json){
					//alert(json);
					createTbody(json);
				});
			}
			
			function createTbody(json){
				var tableBody = $("tbody");
				tableBody.html("");
				var htm = "<tbody>";
				//处理JSON对象i=索引,n=内容
				$.each(json,function(i, n){
					if(i%2==0){
						tableBody.append('<tr class="gradeX"></tr>'); 
					}else{
						tableBody.append('<tr class="gradeC"></tr>'); 
					}
				var tr = $('tr:last', tableBody); 
					var uid = json[i].userID;
				tr.append('<td>' + uid + '</td>'); 
				tr.append('<td>' + json[i].name + '</td>'); 
				tr.append('<td>' + json[i].age + '</td>'); 
				tr.append('<td>' + json[i].phone + '</td>'); 
				tr.append("<td><a href=\"${pageContext.request.contextPath}/toUpdateUser.do?uid="+uid+"\">更新</a>|"+
									"<a href=\"${pageContext.request.contextPath}/deleteUser.do?uid="+uid+"\">删除</a>|"+
									"<a href=\"${pageContext.request.contextPath}/toAddNewAddress.do?uid="+uid+"\">添加新地址</a></td>");
				});
				fillTable();
			}
			
		
			
		</script>

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

		<table border="0" width="100%" style="color: #005AB5;">
			<tr align="center">
				<th width="2%">&nbsp;</th>
				<th width="20%">姓名：<input type="text" id="name" name="name" /></th>
				<th width="20%">用户名：<input type="text" id="userID"
					name="userID" /></th>
				<th width="10%" align="left"><input type="button" name="submit"
					value="查询" onclick="ajaxUser();" /></th>
				<th width="40%" align="right"><a
					href="${pageContext.request.contextPath}/addUser.do">添加用户</a></th>
			</tr>

		</table>

		<c:choose>
			<c:when test="${empty users}">
					尚无用户，请添加！
				</c:when>
			<c:otherwise>
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
								<td><a
									href="${pageContext.request.contextPath}/toUpdateUser.do?uid=${user.userID}">修改</a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a
									href="${pageContext.request.contextPath}/deleteUser.do?uid=${user.userID}">删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>