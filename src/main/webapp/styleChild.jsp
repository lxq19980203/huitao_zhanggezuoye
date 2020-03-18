<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/cypager.min.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/cypager.min.css" />

</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2 left">
				<div class="row">
					<div class="col-md-12"
						style="padding: 6px 40px; padding-left: 30px; background-color: #3A3F51; box-shadow: 0px 1px 2px #333333">
						<span class="glyphicon glyphicon-fire"
							style="font-size: 20px; color: #31B0D5;"></span> <span
							style="font-size: 20px; color: white;">惠淘管理</span>
					</div>
				</div>
				<ul class="nav nav-pills nav-stacked" style="margin-top: 10px;">
					<li><a href="/brand/showall?page=1"><span
							class="glyphicon glyphicon-tags"></span>&nbsp;&nbsp;品牌管理</a></li>
					<li class="active"><a href="/stylechild/showAll?page=1"><span
							class="glyphicon glyphicon-folder-open"></span>&nbsp;&nbsp;分类管理</a></li>
					<li><a href="/shop/showall?page=1"><span
							class="glyphicon glyphicon-shopping-cart"></span>&nbsp;&nbsp;商品管理</a>
					</li>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;账号管理</a>
					</li>

				</ul>

			</div>
			<div class="col-md-10 right">
				<div class="row right-top ">
					<div class="col-md-2 col-md-offset-10">
						<ul class="nav nav-tabs">

							<li class="dropdown"><a class="dropdown-toggle"
								data-toggle="dropdown" href="#"> <span
									class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;${admin.adName }<span
									class="caret"></span>
							</a>
								<ul class="dropdown-menu">
									<li><a href="#"><span
											class="glyphicon glyphicon-wrench"></span>&nbsp;账号设置</a></li>
									<li><a href="#"><span class="glyphicon glyphicon-off"></span>&nbsp;退出登录</a>
									</li>

								</ul></li>

						</ul>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 right-bottom">
						<table class="table table-hover tab">
							<caption>
								<button type="button" class="btn btn-primary" id="add">
									<span class="glyphicon glyphicon-plus"></span>&nbsp;分类添加
								</button>
							</caption>
							<thead>
								<tr>
									<th>分类编号</th>
									<th>分类名</th>
									<th>所属品牌</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${list }" var="sc">
									<tr>
										<td>${sc.stcid }</td>
										<td>${sc.stcname }</td>
										<td>${sc.brand.bname }</td>
										<td>
											<button type="button" class="btn btn-info" stcid="${sc.stcid }" stcname="${sc.stcname }" stBid="${sc.stBid}" name="update">
												<span class="glyphicon glyphicon-edit"></span>
											</button>
											<button type="button" name="delete" stcid="${sc.stcid }" class="btn btn-danger">
												<span class="glyphicon glyphicon-trash"></span>
											</button>
										</td>
									</tr>


								</c:forEach>

							</tbody>
						</table>
						<div id="pagerArea" unselectable="on"
							onselectstart="return false;" style="-moz-user-select: none;"></div>
					</div>
				</div>
			</div>

		</div>

	</div>
	<!-- insert模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel"></h4>
				</div>
				<div class="modal-body">
					<form action="<%=request.getContextPath() %>/stylechild/insert"
						id="for1" method="post">
						<div class="form-group">
							<input type="hidden" name="page" value="${page}">
							<label for="name">&nbsp;分类名:</label> 
							<input type="text" id="stcname" class="form-control" placeholder="" name="stcname"> 
							<label for="name">所属品牌</label> 
							<select class="form-control" name="stBid" id="stBid">
							   <c:forEach items="${blist}" var="b">
							        <option value="${b.bid }">${b.bname }</option>
							   </c:forEach>
							</select>


						</div>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="submitbut" class="btn btn-primary">提交</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- update模态框（Modal） -->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel"></h4>
				</div>
				<div class="modal-body">
					<form action="<%=request.getContextPath() %>/stylechild/update"
						id="for2" method="post">
						<div class="form-group">
							<input type="hidden" name="page" value="${page}"> 
							<input type="hidden" name="stcid" id="upstcid"> 
							<label for="name">&nbsp;分类名:</label> 
							<input type="text" id="upstcname" class="form-control" placeholder="" name="stcname"> 
							<label for="name">所属品牌</label> 
							<select class="form-control" name="stBid" id="upstBid">
							   <c:forEach items="${blist}" var="b">
							        <option value="${b.bid }">${b.bname }</option>
							   </c:forEach>
							</select>
						</div>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="upsubmitbut" class="btn btn-primary">提交</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<script type="text/javascript">
		
	
            
			$("#add").click(function(){
				  $('#myModal').find("#stcname").val("");
				  $('#myModal').find("#stBid").find("option").eq(0).prop("selected",true);
				  $('#myModal').modal('show');
				
			});
		
			$("#submitbut").click(function(){
				var stcname=$("#stcname").val();
				var stBid=$("#stBid").val();
				$.post(
				   "<%=request.getContextPath()%>/stylechild/showByStcnamAndstBidAjax",
				   {"stcname":stcname,"stBid":stBid},
				   function(data){
					   if(data==0){
						   alert("品牌分类已存在，请更换")
					   }else{
						   
						  $("#for1").submit();
					   }
				   },
				   "text"
				);
			});
			
			$("#upsubmitbut").click(function(){
				//先ajax验证名是否存在
				var stcname=$("#upstcname").val();
				var stBid=$("#upstBid").val();
				$.post(
				   "<%=request.getContextPath()%>/stylechild/showByStcnamAndstBidAjax",
				   {"stcname":stcname,"stBid":stBid},
				   function(data){
					   if(data==0){
						   alert("品牌分类已存在，请更换")
					   }else{
						   
						  $("#for2").submit();
					   }
				   },
				   "text"
				);
			});
			
			$("[name=update]").click(function(){
				var stBid=$(this).attr("stBid");
				var stcname=$(this).attr("stcname");
				var stcid=$(this).attr("stcid");
				$("#upstcid").val(stcid);
				$("#upstcname").val(stcname);
				$("#upstBid option[value='"+stBid+"']").prop('selected',true);

				//开启莫态框
				$('#updateModal').modal('show');
			});
			
			$("[name=delete]").click(function(){
				var id=$(this).attr("stcid");
				if(confirm("是否执行删除操作")){
					window.location.href="/stylechild/delete?page="+${page}+"&id="+id;
				}
				
			})			
			  $(function() {				
				    $("#pagerArea").cypager({
				    	pg_count:${page},
				    	pg_size:${pagesize},
				    	pg_nav_count: 8,//分页按钮最大显示个数
				    	pg_total_count:${counts},
				    	pg_call_fun: function(count) {
	                                    //count:实际页数
				            window.location.href="<%=request.getContextPath()%>/stylechild/showAll?page="+count;			          
				        }});
				});
		</script>

</body>

</html>