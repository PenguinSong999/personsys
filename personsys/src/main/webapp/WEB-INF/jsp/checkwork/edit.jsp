<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fkjava" uri="/pager-tags" %> 
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>审批请假</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/public/js/xadmin.js"></script>
    

  </head>
  
  <body>
    <div class="x-body">
        <form class="layui-form" method="POST" id="deptForm"  action="${pageContext.request.contextPath}/checkwork/update">
        <input type="hidden" name="id" id="id" value="${leave.id }" >
        <input type="hidden" name="empId"  value="${leave.empId }" >
        <input type="hidden" name="deptId"  value="${leave.deptId }" >
        <input type="hidden" name="jobId"  value="${leave.jobId}" >
        <input type="hidden" name="leavetypeId"  value="${leave.leavetypeId}" >
        <input type="hidden" name="startdata"  value="${leave.startdata}" >
        <input type="hidden" name="enddata"  value="${leave.enddata}" >
        <input type="hidden" name="leavedays"  value="${leave.leavedays}" >
        <input type="hidden" name="content"  value="${leave.content}" >
          <div class="layui-form-item" >
              <label for="name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="name" name="name" disabled="disabled" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${leave.employeeInf.name }">
              </div>
             
          </div>
          <div class="layui-form-item" >
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>部门
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="phone" disabled="disabled"  required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${leave.employeeInf.deptInf.name}">
              </div>
          </div>
          
          
            <div class="layui-form-item" >
              <label for="sex_id" class="layui-form-label">
                  <span class="x-red">*</span>职位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sex_id" disabled="disabled"  required="" lay-verify="required"
                         autocomplete="off" class="layui-input" value="${leave.employeeInf.jobInf.name}">
              </div>
          </div>

            <div class="layui-form-item" >
                <label for="start" class="layui-form-label">
                    <span class="x-red">*</span>开始时间
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="start" disabled="disabled"  name="startdata" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${leave.startdata}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="e" class="layui-form-label">
                    <span class="x-red">*</span>结束时间
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="e" disabled="disabled" name="enddata"  required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${leave.enddata}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="d" class="layui-form-label">
                    <span class="x-red">*</span>请假天数
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="d" disabled="disabled"  name="leavedays" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${leave.leavedays}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="t" class="layui-form-label">
                    <span class="x-red">*</span>请假类型
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="t" disabled="disabled"  required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${leave.leavetypeInf.name}">
                </div>
            </div>


            <div class="layui-form-item" >
                <label for="r" class="layui-form-label">
                    <span class="x-red">*</span>请假原因
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="r" disabled="disabled" name="content"  required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${leave.content}">
                </div>
            </div>

  		<div class="layui-form-item">
              <label for="job_id" class="layui-form-label">
                  <span class="x-red">*</span>审批
              </label>
              <div class="layui-input-inline">
                  <select id="job_id" name="leavestatusId" class="valid" >
                  <option value="0">--审批选择--</option>
						   <c:forEach items="${requestScope.leavestatusInf_list}" var="leavestatusInf">
						   		<c:choose>
			    					<c:when test="${leave.leavestatusId == leavestatusInf.id }">
			    						<option value="${leavestatusInf.id }" selected="selected">${leavestatusInf.name }</option>
			    					</c:when>
			    					<c:otherwise>
			    						<option value="${leavestatusInf.id }">${leavestatusInf.name}</option>
			    					</c:otherwise>
			    				</c:choose>
			    			</c:forEach>
                  </select>
              </div>
          </div>

          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <input type="submit" value=" 提交" class="layui-btn" lay-filter="add" lay-submit=""/>
              <div style="color: red">${message }</div>
          </div>
      </form>
    </div>
    <script>
          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("修改成功", {icon: 6},function () {
            	document.getElementById('deptForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
          });

    </script>
    
  </body>

</html>