<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fkjava" uri="/pager-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>用户信息</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/public/logo.ico"
	type="image/x-icon" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/public/css/font.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/public/css/xadmin.css">
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/js/xadmin.js"></script>
<script type="text/javascript">
     $(function(){
    	if(${count}!=0){
    		$("#count1").hide();
    		$("#count2").show();
    	}
      })
    </script>
</head>

<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="">首页</a> <a> <cite>访问用户信息</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="${pageContext.request.contextPath}/uservisit/list" title="刷新">
			<i class="layui-icon" style="line-height: 30px">ဂ</i>
		</a>
	</div>
	<div class="x-body">
		<div class="layui-row" style="" align="center">
			<form class="layui-form layui-col-md12 x-so" method="get"
				action="${pageContext.request.contextPath}/uservisit/querylist">
				<input type="text" name="content" style="width: 50%;"
					placeholder="请输入查找内容" autocomplete="off" class="layui-input">
				<button class="layui-btn">
					<i class="layui-icon">&#xe615;</i>
				</button>
			</form>
		</div>
		<table class="layui-hide" id="test" lay-filter="demo"></table>

	<script type="text/html" id="barDemo">
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>
	<script>
		layui.use('table', function(){
			var table = layui.table;
			var $ = layui.$;
			table.render({
				elem: '#test'
				,url:'/uservisit/list'
				,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
				,cols: [[
					{field:'id', width:80, title: 'ID', align: 'center'}
					,{field:'loginname', width:80, title: '登录名', align: 'center'}
					,{field:'loginTime', width:150, title: '登录时间', align: 'center'}
					,{field:'exitTime', width:150, title: '退出时间', align: 'center'}
					,{field:'visitIp', width:80, title: '访问IP', align: 'center'}
					,{field:'userFrom', width:80, title: '用户设备', align: 'center',templet:'#status'}
					,{field:'browser', width:80, title: '浏览器', align: 'center'}
					,{field:'system', width:80, title: '操作系统', align: 'center'}
					,{field:'version', width:80, title: '版本', align: 'center'}
					,{fixed: 'right', width:200, align:'center', title:'操作',toolbar: '#barDemo'}
				]]
				,page: true
			});

			//监听工具条
			table.on('tool(demo)', function(obj){
				var data = obj.data;
				if(obj.event === 'del'){
					layer.confirm('真的删除行么', function(index){
						$.post("/uservisit/deleteUserVisit",{id:data.id},function () {

						})
						obj.del();
						layer.close(index);
					});
				}
			});
		});
	</script>
</body>

</html>