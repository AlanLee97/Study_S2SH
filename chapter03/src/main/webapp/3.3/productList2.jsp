<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/9/12
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>

<table border="1" align="center" width="80%">
    <tr>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>数量</th>
        <th colspan="2">操作</th>
    </tr>
    <tr>
        <td>1001</td>
        <td>小米8</td>
        <td>1000</td>
        <td><a href="editProduct.action?productId=1001">编辑</a></td>
        <td><a href="delProduct.action?productId=1001">删除</a></td>
    </tr>

    <tr>
        <td>1001</td>
        <td>华为p30</td>
        <td>2000</td>
        <td><a href="editProduct.action?productId=1002">编辑</a></td>
        <td><a href="delProduct.action?productId=1002">删除</a></td>
    </tr>

</table>

</body>
</html>
