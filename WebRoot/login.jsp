<%@ page language="java" pageEncoding="utf-8"%>
<html>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>

<title>芒果菠萝饭</title>
<style>

body{
background-color: #004B97;
}

#1{
margin-top:10%;
margin-left:40%;
width:250;
height:247;
background-image: url(images/1.png);
background-repeat: no-repeat;
}

#2{
margin-top:50px;
margin-left:50px;
width:150;
height:30;
cursor:pointer;
background-image: url(images/2.png);
}

#userID{
 margin-top:41px;
margin-left:-36px;
width:152;
height:30;
font-size:19;
}
#password{
margin-top:14px;
margin-left:-36px;
width:152;
height:30;
font-size:19;
}


</style>


<body>

	<form name="form1"
		action="${pageContext.request.contextPath}/userLogin.do" method="post">
		
		<div id="1">
		<input type="text" id="userID" name="userID">
		<input type="password" id="password" name="password">
		<a onclick="doSumit()" id="2"></a>
		</div>
		
		
	
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
