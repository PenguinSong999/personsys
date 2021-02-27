<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>测试入口</title>
</head>
<body>

<!-- 本页面用于没有编写后台代码之前，预览系统功能使用， 后台代码实现完成后可以删除本页面  -->
<%
    // 预览登录页
    request.getRequestDispatcher("WEB-INF/jsp/loginForm.jsp").forward(request, response);

    // 预览主页
//    request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);

%>

</body>
</html>