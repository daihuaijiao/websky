<%   
    String path = request.getContextPath();   
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/bootstarp3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/login.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.5/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/bootstarp3.3.7/js/bootstrap.js"></script>
	
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-offset-3 col-md-6">
	            <form id="login_form" method="post" class="form-horizontal">
	                <span class="heading">用户登录</span>
	                <div id="error_msg"></div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="username" name="username"placeholder="用户名">
	                    <i class="fa fa-user"></i>
	                </div>
	                <div class="form-group help">
	                    <input type="password" class="form-control" id="password" name="password" placeholder="密　码">
	                    <i class="fa fa-lock"></i>
	                    <a href="#" class="fa fa-question-circle"></a>
	                </div>
	                <div class="form-group">
	                    <div class="main-checkbox">
	                        <input type="checkbox" value="None" id="checkbox1" name="check"/>
	                        <label for="checkbox1"></label>
	                    </div>
	                    <span class="text">Remember me</span>
		                <button type="reset" class="btn btn-default" onclick="">取消</button>
		                <button type="button" class="btn btn-default" onclick="submitForm()">登录</button>
	                </div>
	            </form>
	        </div>
	    </div>
	</div>
</body>
<script type="text/javascript">
	
	function submitForm() {

		/*
		if(!$('#login_form').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}*/
		
		$.post("protal/logInCheck.action",$("#login_form").serialize(), function(data){
			
			if(data.status == 200){
				//window.l("protal/login.action");
				window.location.href='protal/login.action';
			} else {
				document.getElementById("error_msg").innerHTML = data.msg;
			}
		});
	}

</script>
</html>
