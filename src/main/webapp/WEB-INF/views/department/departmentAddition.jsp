<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门</title>
</head>
<body>
<form action="/department/additionDepartment.do">
    部门名称  <input type="text" name="dName" required><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
