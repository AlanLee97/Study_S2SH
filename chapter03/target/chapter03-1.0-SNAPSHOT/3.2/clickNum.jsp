<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/9/12
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>点击增加数字</title>
</head>
<body>
<form action="clickNum.action">
    <p>
        <input type="submit" value="点击">
    </p>
</form>

<p>
    点击按钮，点击了
    ${empty applicationScope.num? 0 : applicationScope.num}
    次。
</p>
</body>
</html>
