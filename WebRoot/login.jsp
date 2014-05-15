<%@ page language="java" pageEncoding="utf-8"%>
<html>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<head>
<link rel="shortcut icon"  href="icon/favicon.ico" />
<title>One Piece</title>
</head>
<style>
</style>


<body>

	<form name="form1"
		action="${pageContext.request.contextPath}/userLogin.do" method="post">

		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="userID" name="userID"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" onclick="doSumit()"
					value="登录"></td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
   
  function doSumit(){
	  var userID=$("#userID").val();
	  var pass=$("#password").val();
     
	  
	 $.ajax({ 
          type: "post", 
          url: "checkUser.do",
          data:"userID="+userID+"&password="+pass,
          dataType: "text", 
          success: function (data) { 
                if(data=='success'){
                	document.form1.submit();
                     return true;
                }else{
                	 alert(data);
                	 return false;
                }
             }
          });
  }
  
  
  </script>
</html>
