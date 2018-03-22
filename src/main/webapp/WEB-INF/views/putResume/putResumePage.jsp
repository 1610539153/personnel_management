<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/22
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>投放简历</title>
</head>
<body>
<form action="/putResume/putResume.do">
    部门名称<select name="dName" >
    <option value ="薪资部">薪资部</option>
    <option value ="组织部">组织部</option>
    <option value ="招聘部">招聘部</option>
    <option value ="培训部">培训部</option>
    <option value ="绩效部">绩效部</option>
    <option value ="员工部">员工部</option>
    </select>
    职位名称 <select name="postName">
    <option value ="总经理">总经理</option>
    <option value ="副经理">副经理</option>
    <option value ="大管理">大管理</option>
    <option value ="小管理">小管理</option>
    <option value ="组长">组长</option>
    <option value ="成员">成员</option>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>
