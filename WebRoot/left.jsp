<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/comm/comm.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>管理页面</title>
</head>

<body>
      <h1 class="type"><a href="javascript:void(0)">系统管理</a></h1>
      <div class="content">
        <ul class="MM">
          <li><a href="listUser.do" target="mainFrame">用户管理</a></li>
          <li><a href="roleList.do" target="mainFrame">角色管理</a></li>
          <li><a href="rightList.do" target="mainFrame">权限管理</a></li>
          <li><a href="roleRight.do" target="mainFrame">角色权限管理</a></li>
      
        </ul>
      </div>
</body>
</html>
