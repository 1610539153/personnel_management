<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布招聘</title>
</head>
<body>
<form action="/recruitMessage/recruit.do">
    基本薪资<select name="recruitSalary" >
            <option value ="4000">4000</option>
            </select>
    需求人数 <input type="text" name="recruitNumber" required><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
