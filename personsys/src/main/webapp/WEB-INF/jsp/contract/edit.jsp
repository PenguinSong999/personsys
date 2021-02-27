<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fkjava" uri="/pager-tags" %> 
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>合同编辑</title>
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
        <form class="layui-form" method="POST" id="deptForm"  action="${pageContext.request.contextPath}/contract/update">
        <input type="hidden" name="id" id="id" value="${contract.id }" >
        <input type="hidden" name="deptId" value="${contract.deptId }" >
        <input type="hidden" name="jobId"  value="${contract.jobId }" >
        <input type="hidden" name="empId"  value="${contract.empId }" >
        <input type="hidden" name="createDate"  value="${contract.createDate}" >
          <div class="layui-form-item" >
              <label for="name" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <select id="name" name="empId" class="valid" >
                      <option value="0">--员工选择--</option>
                      <c:forEach items="${requestScope.employeeInf_list}" var="employeeInf">
                          <c:choose>
                              <c:when test="${contract.empId == employeeInf.id }">
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
                              <c:when test="${contract.deptId == deptInf.id }">
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
                              <c:when test="${contract.jobId == jobInf.id }">
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
                <label for="a1" class="layui-form-label">
                    <span class="x-red">*</span>培训合同审批
                </label>
                <div class="layui-input-inline">
                    <select id="a1" name="traincontractId" class="valid" >
                        <option value="0">--培训合同审批--</option>
                        <c:forEach items="${requestScope.traincontractInf_list}" var="traincontractInf">
                            <c:choose>
                                <c:when test="${contract.traincontractId == traincontractInf.id }">
                                    <option value="${traincontractInf.id }" selected="selected">${traincontractInf.name }</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${traincontractInf.id }">${traincontractInf.name}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="layui-form-item" >
                <label for="a2" class="layui-form-label">
                    <span class="x-red">*</span>劳动合同审批
                </label>
                <div class="layui-input-inline">
                    <select id="a2" name="laborcontractId" class="valid" >
                        <option value="0">--劳动合同审批--</option>
                        <c:forEach items="${requestScope.laborcontractInf_list}" var="laborcontractInf">
                            <c:choose>
                                <c:when test="${contract.laborcontractId == laborcontractInf.id }">
                                    <option value="${laborcontractInf.id }" selected="selected">${laborcontractInf.name }</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${laborcontractInf.id }">${laborcontractInf.name}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="layui-form-item" >
                <label for="a3" class="layui-form-label">
                    <span class="x-red">*</span>保密合同审批
                </label>
                <div class="layui-input-inline">
                    <select id="a3" name="confidentialitycontractId" class="valid" >
                        <option value="0">--保密合同审批--</option>
                        <c:forEach items="${requestScope.confidentialitycontractInf_list}" var="confidentialitycontractInf">
                            <c:choose>
                                <c:when test="${contract.confidentialitycontractId == confidentialitycontractInf.id }">
                                    <option value="${confidentialitycontractInf.id }" selected="selected">${confidentialitycontractInf.name }</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${confidentialitycontractInf.id }">${confidentialitycontractInf.name}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="layui-form-item" >
                <label for="a4" class="layui-form-label">
                    <span class="x-red">*</span>状态
                </label>
                <div class="layui-input-inline">
                    <select id="a4" name="statusId" class="valid" >
                        <option value="0">--状态选择--</option>
                        <c:forEach items="${requestScope.statusInf_list}" var="statusInf">
                            <c:choose>
                                <c:when test="${contract.statusId == statusInf.id }">
                                    <option value="${statusInf.id }" selected="selected">${statusInf.name }</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${statusInf.id }">${statusInf.name}</option>
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