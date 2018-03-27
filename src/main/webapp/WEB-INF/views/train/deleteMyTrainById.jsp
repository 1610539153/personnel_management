<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/24
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除我发布的培训消息</title>
</head>
<body>
<form action="/train/deleteMyTrain.do">
    请输入你需要删除的培训信息Id<input type="text" name="id" required><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
