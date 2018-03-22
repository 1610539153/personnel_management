<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改简历</title>
</head>
<body>
<form action="/resume/update.do">
        姓名<input type="text" name="rName"><br/>
        家庭住址<input type="text" name="homeAdd" ><br/>
        现居地点<input type="text" name="presentAddress" ><br/>
        学历<input type="text" name="educatonBackgroundi" ><br/>
        学校<input type="text" name="college" ><br/>
        专业<input type="text" name="major" ><br/>
        个人简介<input type="text" name="individualResume"><br/>
       <input type="submit" value="提交">
</form>

</form>
</body>
</html>
