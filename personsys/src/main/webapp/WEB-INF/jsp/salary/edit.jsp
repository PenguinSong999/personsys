<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fkjava" uri="/pager-tags" %> 
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>薪酬编辑</title>
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
        <form class="layui-form" method="POST" id="deptForm"  action="${pageContext.request.contextPath}/salary/update">
        <input type="hidden" name="id" id="id" value="${salary.id }" >
        <input type="hidden" name="createDate"  value="${salary.createDate}" >
          <div class="layui-form-item" >
              <label for="name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <select id="name" name="empId" class="valid" >
                      <option value="0">--员工选择--</option>
                      <c:forEach items="${requestScope.employeeInf_list}" var="employeeInf">
                          <c:choose>
                              <c:when test="${salary.empId == employeeInf.id }">
                                  <option value="${employeeInf.id }" selected="selected">${employeeInf.name }</option>
                              </c:when>
                              <c:otherwise>
                                  <option value="${employeeInf.id }">${employeeInf.name}</option>
                              </c:otherwise>
                          </c:choose>
                      </c:forEach>
                  </select>
              </div>
             
          </div>
          <div class="layui-form-item" >
              <label for="dept" class="layui-form-label">
                  <span class="x-red">*</span>部门
              </label>
              <div class="layui-input-inline">
                  <select id="dept" name="deptId" class="valid" >
                      <option value="0">--部门选择--</option>
                      <c:forEach items="${requestScope.deptInf_list}" var="deptInf">
                          <c:choose>
                              <c:when test="${salary.deptId == deptInf.id }">
                                  <option value="${deptInf.id }" selected="selected">${deptInf.name }</option>
                              </c:when>
                              <c:otherwise>
                                  <option value="${deptInf.id }">${deptInf.name}</option>
                              </c:otherwise>
                          </c:choose>
                      </c:forEach>
                  </select>
              </div>
          </div>
          
          
            <div class="layui-form-item" >
              <label for="job" class="layui-form-label">
                  <span class="x-red">*</span>职位
              </label>
              <div class="layui-input-inline">
                  <select id="job" name="jobId" class="valid" >
                      <option value="0">--职位选择--</option>
                      <c:forEach items="${requestScope.jobInf_list}" var="jobInf">
                          <c:choose>
                              <c:when test="${salary.jobId == jobInf.id }">
                                  <option value="${jobInf.id }" selected="selected">${jobInf.name }</option>
                              </c:when>
                              <c:otherwise>
                                  <option value="${jobInf.id }">${jobInf.name}</option>
                              </c:otherwise>
                          </c:choose>
                      </c:forEach>
                  </select>
              </div>
          </div>

            <div class="layui-form-item" >
                <label for="start" class="layui-form-label">
                    <span class="x-red">*</span>基本工资
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="start"  name="salaryStation" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${salary.salaryStation}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="e" class="layui-form-label">
                    <span class="x-red">*</span>工资水平
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="e"  name="salaryLevel"  required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${salary.salaryLevel}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="d" class="layui-form-label">
                    <span class="x-red">*</span>工龄工资
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="d"  name="seniorityPay" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${salary.seniorityPay}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="d1" class="layui-form-label">
                    <span class="x-red">*</span>绩效
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="d1"  name="performance" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${salary.performance}">
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="d2" class="layui-form-label">
                    <span class="x-red">*</span>个人收入
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="d2"  name="individualIncome" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${salary.individualIncome}">
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