<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@ taglib uri="/pager-tags" prefix="fkjava" %>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>培训资源</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/xadmin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/lib/layui/css/layui.css"/>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/js/xadmin.js"></script>
    <script type="text/javascript">
    $(function(){
    	/** 下载文档功能 */
    	$("a[id^='down_']").click(function(){
    		/** 得到需要下载的文档的id */
    		var filename = this.id.replace("down_","");
    		/** 下载该文档 */
    		window.location = "${pageContext.request.contextPath}/traindata/downLoad?filename="+filename;
    	})
    })
    </script>
    
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
    		$("#ID").css("display", "block"); 
    		$('tr').find('td:eq(0)').show();
    		$('tr').find('td:eq(8)').show();
    	}else{
    		$("#aaa").hide();
    		$("#bbb").hide(); 
    		$("#do").css("display", "none"); 
    		$("#ID").css("display", "none");
    		$('tr').find('td:eq(8)').hide();
    	};
    }) 
  </script>
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>培训资源</cite></a>
      </span>
            <button id="aaa" type="button" onclick="location.href='${pageContext.request.contextPath}/train/addpage'" class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:inherit;margin-left:75%;;"  lay-submit="" lay-filter="sreach"><i class="layui-icon"></i>增加</button>
      
      <a id="bbb" class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="${pageContext.request.contextPath }/train/listdata" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row" style="" align="center">
        <form class="layui-form layui-col-md12 x-so" method="get" action="${pageContext.request.contextPath }/train/listdata">
          <input type="text" name="content" style="width:50%;"  placeholder="请输入查找内容" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
          <table class="layui-hide" id="test" lay-filter="demo"></table>
    </div>
          <script type="text/html" id="barDemo">
              <a class="layui-btn layui-btn-xs" lay-event="edit">下载</a>
              <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
          </script>
          <script>
              <%--layui表格渲染如果对象为空时取属性信息，则表格不会渲染--%>
              layui.use('table', function () {
                  var table = layui.table;
                  var $ = layui.$;
                  table.render({
                      elem: '#test'
                      , url: '/train/listdata'
                      , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                      , cols: [[
                          {field: 'id', width: 80, title: 'ID', align: 'center'}
                          , {field: 'title', width: 120, title: '标题', align: 'center'}
                          , {field: 'filename', width: 200, title: '文件名', align: 'center',event:"play"}
                          , {field: 'remark', width: 200, title: '描述', align: 'center'}

                          , {
                              field: 'name', width: 100, title: '发布用户', align: 'center', templet: function (res) {
                                  return res.userInf.username;
                              }
                          }
                          , {field: 'createdate', width: 150, title: '发布日期', align: 'center'}
                          , {fixed: 'right', width: 150, align: 'center', title: '操作', toolbar: '#barDemo'}
                      ]]
                      , page: true
                  });

                  //监听工具条
                  table.on('tool(demo)', function (obj) {
                      var data = obj.data;
                      if (obj.event === 'del') {
                          layer.confirm('真的删除行么', function (index) {
                              $.post("/train/delete", {id: data.id}, function () {

                              });
                              obj.del();
                              layer.close(index);
                          });
                      } else if (obj.event === 'edit') {
                          location.href = "/train/download?id=" + data.id;
                      }
                    if(obj.event === 'play'){
                      layer.ready(
                              function () {
                                var index = layer.open({
                                  type: 2,
                                  content: '${pageContext.request.contextPath}/train/play?filename='+data.filename,  //  视频播放页面
                                  area: ['600px', '450px'],
                                  offset:'t',
                                  maxmin: true,
                                  end: function () {

                                  }
                                });
                              }
                      );
                    }
                  });

                  //监听单元格事件
                /*  table.on('tool(demo)', function(obj){
                      var data = obj.data;
                      if(obj.event === 'play'){
                          layer.ready(
                          function () {
                              var index = layer.open({
                                  type: 2,
                                  content: '${pageContext.request.contextPath}/train/play?filename='+data.filename,  //  视频播放页面
                                  area: ['600px', '450px'],
                                  offset:'t',
                                  maxmin: true,
                                  end: function () {

                                  }
                              });
                          }
                          );
                      }
                  });*/
              });
          </script>
  </body>

</html>