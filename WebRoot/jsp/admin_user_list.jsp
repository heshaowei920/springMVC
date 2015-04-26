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
<script src="${ctx}/layer/layer.js"></script>
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
    <input type="button" id="test1" value="test1">
    
    <input type="button" id="test2" value="test2">
    <input type="button" id="test3" value="询问框">
    <input type="button" id="test4" value="加载框">
    
    <input type="button" id="test5" value="提示框">
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
<script>

$('#test1').on('click', function(){
	var ii=layer.msg(
			  '保存中...', 
			 {icon: 16,time:0,shade:[0.3, '#000']},
			 function(){
	    
	});
	
	setTimeout(function(){
        layer.close(ii);
        layer.msg('保存成功！');
    }, 3000);
	
});

$('#test2').on('click', function(){
    layer.open({
        type: 1,
        area: ['600px', '360px'],
        shadeClose: false, //点击遮罩关闭
        content: '<div style="padding:20px;"><form><input type="text"/></form></div>'
    });
});

$('#test4').on('click', function(){
	
    var ii = layer.load(1);
    //此处用setTimeout演示ajax的回调
    setTimeout(function(){
        layer.close(ii);
        layer.msg('保存成功！');
    }, 10000);
});


$('#test3').on('click', function(){
layer.confirm('is not?', {icon: 4, title:'提示'}, function(index){
    //do something
    
    layer.close(index);
});
});

$('#test5').on('click', function(){
	layer.alert("手机号码填写不规范!");
});


</script>
</html>