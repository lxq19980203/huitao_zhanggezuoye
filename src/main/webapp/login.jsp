<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.4.1.min.js" ></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap.min.js" ></script>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/static.css"/>
	</head>
	<body>
		<div class="container-fluid">
			<!--top-->
			<div class="row top">
				 <div class="col-md-2">
				 	<img src="img/惠淘logo.bmp" />
				 </div>
				 <div class="col-md-2 col-md-offset-8 text">
				 	 <span class="glyphicon glyphicon-earphone"></span> <span>: 0532-8899998</span>
				 </div>
			</div>
			<!--center-->
			<div class="row center">
				 <div class="col-md-3 col-md-offset-8 login">
			
				 	 <form id="for" action="/admin/login" method="post">
				 	 	<div class="row" style="display: none">
				 	 		<div class="col-md-10 col-lg-offset-1" style="padding-top: 20px;">
				 	 		   <div class="alert alert-danger" style="padding-top: 3px; padding-bottom: 3px; margin: 0;" id="tishi"></div>
				 	 		</div>
				 	 	</div>
				 	 	<div class="row input-div" style="padding-top: 5px;">
				 	 		<div class="col-md-10 col-md-offset-1">
				 	 			<input type="text" id="adName" name="adName" class="form-control" placeholder="用户名">
				 	 		</div>
				 	 	</div>
				 	 	<div class="row input-div">
				 	 		<div class="col-md-10 col-md-offset-1">
				 	 			<input type="password" id="adPass" name="adPass" class="form-control" placeholder="密码">
				 	 		</div>
				 	 	</div>
				 	 	<div class="row input-div">
				 	 		<div class="col-md-10 col-md-offset-1">
				 	 			   <button id="submitbut" type="button" style="padding-top: 5px; padding-bottom: 5px;" class="btn btn-primary btn-lg btn-block" >登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
				 	 		</div>
				 	 	</div>
				 	 </form>
				 	
				 </div>
			</div>
			<!--bottom-->
			<div class="row">
				 <div  class="row" style="padding-top: 50px;letter-spacing: 1px;">
				 	<div class="col-md-12 text-center"><a href="">关于我们</a> | <a href="">招聘信息</a> | <a href="">联系我们</a> | <a href="">技术支持</a></div>
				 </div>
			</div>
		</div>
		
		<script type="text/javascript">
		    $("#submitbut").click(function(){
		    	var adName=$("#adName").val();
		    	var adPass=$("#adPass").val();
		    	if(adName!=""&&adPass!=""){
		    		$.post(
		    		  "/admin/loginAjax",
		    		  {"adName":adName,"adPass":adPass},
		    		  function(data){
		    			  if(data==0){
		    				$("#tishi").html("账号密码有误，请重写输入");
		  		    		$("#tishi").parent().parent().show();
		    			  }else{
		    				  $("#tishi").html("");
			  		    	  $("#tishi").parent().parent().hide();
			  		    	  //验证无误
			  		    	  $("#for").submit();//让form表单触发提交，进入正式登录方法，开始跳转
		    			  }
		    		  },
		    		  "text"
		    		);
		    	}else{
		    		$("#tishi").html("请输入账号密码");
		    		$("#tishi").parent().parent().show();
		    	}
		    	
		    });
		
		</script>
	</body>
</html>
