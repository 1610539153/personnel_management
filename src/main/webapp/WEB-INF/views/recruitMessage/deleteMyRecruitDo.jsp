<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除我的招聘信息</title>
</head>
<body>
<form action="/recruitMessage/deleteMyRecruit.do">
    需要删除的招聘信息的编号<input type="text" name="id" required><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
