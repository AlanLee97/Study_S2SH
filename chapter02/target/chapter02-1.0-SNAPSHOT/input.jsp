<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/9/6
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入信息</title>
</head>
<body>
<form action="user.action" method="post">
    <p>
        用户名：<input type="text" name="username" >
    </p>
    <p>
        地址：<input type="text" name="address" >
    </p>
    <p>
        电话：<input type="text" name="telephone" >
    </p>
    <p>
        邮箱：<input type="text" name="email" >
    </p>
    <input type="submit" name="" value="提交">
</form>
</body>
</html>
