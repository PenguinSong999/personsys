<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/lib/layui/css/layui.css"  media="all">
    <title>用户信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
     <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/js/xadmin.js"></script>

  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>用户信息</cite></a>
      </span>
      <button type="button" onclick="location.href='${pageContext.request.contextPath}/job/addpage'" class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:inherit;margin-left:75%;"  ><i class="layui-icon"></i>增加</button>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="${pageContext.request.contextPath}/job/listdata" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="#">
        <div class="layui-inline">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
              <select id="type" name="type" lay-verify="required" lay-search="">
                <option value="loginname">选择搜素类型</option>
                <option value="loginname">登录名</option>
                <option value="username">用户名</option>
              </select>
            </div>
          </div>
          <input type="text" id="content" name="content" style="width:50%;"  placeholder="请输入查找内容" autocomplete="off" class="layui-input">
          <button class="layui-btn" id="btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>


        <table class="layui-hide" id="test" lay-filter="demo" ></table>

    </div>


  </body>
  <script type="text/html" id="status">
      {{#  if(d.statusId === 1){ }}
      <span >已审核</span>
      {{#  } else { }}
      <span>未审核</span>
      {{#  } }}
  </script>
  <script type="text/html" id="barDemo">
      <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
      <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  </script>
  <script>
      layui.use('table', function(){
          var table = layui.table;
          var $ = layui.$;
          table.render({
              elem: '#test'
              ,url:'/user/listdata'
              ,cellMinWidth: 150 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
              ,cols: [[
                  {field:'id', width:150, title: 'ID', align: 'center'}
                  ,{field:'loginname', width:150, title: '登录名', align: 'center'}
                  ,{field:'username', width:150, title: '用户名', align: 'center'}
                  ,{field:'statusId', width:150, title: '状态', align: 'center',templet:'#status'}
                  ,{field:'createdate', width:300, title: '注册日期', align: 'center'}
                  ,{fixed: 'right', width:200, align:'center', title:'操作',toolbar: '#barDemo'}
              ]]
              ,id:"idTest"
              ,page: true
          });

          //监听工具条
          table.on('tool(demo)', function(obj){
              var data = obj.data;
              if(obj.event === 'del'){
                  layer.confirm('真的删除行么', function(index){
                      $.post("/user/deleteUser",{id:data.id},function () {

                      });
                      obj.del();
                      layer.close(index);
                  });
              } else if(obj.event === 'edit'){
                  location.href="/user/editUser?id="+data.id;
              }
          });
        function rd() {
          let type = $("#type").val();
          let content = $("#content").val();
          table.reload('idTest', {
           where: { //设定异步数据接口的额外参数，任意设
              type: type
              ,content: content
            }
            ,page: {
              page: 1 //重新从第 1 页开始
            }
          }); //只重载数据
        }
        $("form").on("submit",false);
        $(".layui-btn").on("click",rd);

      });


  </script>
</html>