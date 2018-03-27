<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/3/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>${emp1}</h1>
<form action="/emp/login.do">
    用户名<input type="text" name="empName" required><br/>
    密码<input type="password" name="empPassword" required><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
