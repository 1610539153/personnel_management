<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/22
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加面试信息</title>
</head>
<body>
<form action="/interview/additionInterviewMessage.do">
    面试时间<input type="date" name="interviewTime" required><br/>
    面试地点<input type="text" name="interviewSite" required><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
