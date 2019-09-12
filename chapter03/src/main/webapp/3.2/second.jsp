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
    <title>显示用户信息</title>
</head>
<body>
<h2>请求中的用户信息: ${param.username}</h2>
<h2>当前用户信息: ${sessionScope.CurUser}</h2>

</body>
</html>
