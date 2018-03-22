<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/17
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简历的投放</title>
</head>
<body>
<h1>${resume1}</h1>
<form action="/resume/write.do">
    姓名<input type="text" name="rName"  required ><br/>
    家庭住址<input type="text" name="homeAdd" ><br/>
    现居地点<input type="text" name="presentAddress" ><br/>
    学历<input type="text" name="educationBackground" ><br/>
    学校<input type="text" name="college" ><br/>
    专业<input type="text" name="major" ><br/>
    个人简介<input type="text" name="individualResume" ><br/>
    <input type="submit" value="提交" >
</form>
</body>
</html>
