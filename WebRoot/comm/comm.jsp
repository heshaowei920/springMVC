<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 
String path=request.getContextPath();
String domain=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
String basePath=domain+path;

pageContext.setAttribute("ctx",path);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="${ctx}/js/jquery-1.11.0.js"></script>
