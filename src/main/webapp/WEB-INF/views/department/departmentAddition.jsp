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
    部门名称<select name="dName" >
    <option value ="薪资部">薪资部</option>
    <option value ="组织部">组织部</option>
    <option value ="招聘部">招聘部</option>
    <option value ="培训部">培训部</option>
    <option value ="绩效部">绩效部</option>
    <option value ="员工部">员工部</option>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>
