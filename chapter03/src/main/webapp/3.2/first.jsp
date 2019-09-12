<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/9/12
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h2>登录成功，欢迎您，${param.username}</h2>
<h3>当前用户: ${sessionScope.CurUser}</h3>
<a href="second.jsp">下一页</a>

</body>
</html>
