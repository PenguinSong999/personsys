<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>考勤列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/xadmin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/lib/layui/css/layui.css" media="all">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/js/xadmin.js"></script>

    <script type="text/javascript">
    $(function(){
    	if(${count}!=0){
    		$("#count1").hide();
    		$("#count2").show();
    	}
    	var username = "${sessionScope.user_session.loginname}";
    	if(username=="admin"||username=="manager"){
    		$("#aaa").show(); 
    		$("#bbb").show(); 
    		$("#do").css("display", "block"); 
    		$("#ID").show(); 
    		
    		$('tr').find('td:eq(11)').show();
    	}else{
    		$("#aaa").hide();
    		$("#bbb").hide(); 
    		$("#do").css("display", "none"); 
    		$("#ID").hide();
    		$('tr').find('td:eq(11)').hide();
    	};
    }) 
  </script>
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>考勤列表</cite></a>
      </span>
      <a id="bbb" class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="${pageContext.request.contextPath}/employee/listdata" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="${pageContext.request.contextPath}/employee/listdata">
          
          <input type="text" name="content" style="width:50%;"  placeholder="请输入查找内容" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>

        <table class="layui-hide" id="test" lay-filter="demo"></table>
    </div>

  </body>
  <script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">审批</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  </script>
  <script>
    <%--layui表格渲染如果对象为空时取属性信息，则表格不会渲染--%>
      layui.use('table', function(){
          var table = layui.table;
          var $ = layui.$;
          table.render({
              elem: '#test'
              ,url:'/checkwork/leavelistdata'
              ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
              ,cols: [[
                  {field:'id', width:80, title: 'ID', align: 'center'}
                  ,{field:'name', width:100, title: '员工名', align: 'center',templet:function (res) {
                      return res.employeeInf.name;
                    }}
                  ,{field:'name', width:80, title: '职位', align: 'center',templet:function (res) {
                  return res.employeeInf.jobInf.name;
                }}
                  ,{field:'name', width:80, title: '部门', align: 'center',templet:function (res) {
                     return res.employeeInf.deptInf.name;
                }}
                  ,{field:'startdata', width:120, title: '起始时间', align: 'center'}
                  ,{field:'enddata', width:120, title: '结束时间', align: 'center'}
                  ,{field:'leavedays', width:120, title: '请假天数', align: 'center'}
                  ,{field:'name', width:120, title: '请假类型', align: 'center',templet:function (res) {
                  return res.leavetypeInf.name;
                }}
                  ,{field:'content', width:120, title: '原因', align: 'center'}
                  ,{field:'name', width:120, title: '状态', align: 'center',templet:function (res) {
                  return res.leavestatusInf.name;
                }}
                  ,{fixed: 'right', width:150, align:'center', title:'操作',toolbar: '#barDemo'}
              ]]
              ,page: true
          });

          //监听工具条
          table.on('tool(demo)', function(obj){
              var data = obj.data;
              if(obj.event === 'del'){
                  layer.confirm('真的删除行么', function(index){
                      $.post("/checkwork/deleteleave",{id:data.id},function () {

                      })
                      obj.del();
                      layer.close(index);
                  });
              } else if(obj.event === 'edit'){
                  location.href="/checkwork/editleave?id="+data.id;
              }
          });
      });
  </script>
</html>