<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请输入需要添加的职位部门</title>
</head>
<body>
<form action="/department/additionPostDepartment.do">
    <table>
    <%--<tr><td>部门</td></tr>--%>
    <tr>
       <td>部门名称 <select name="dName">
          <c:forEach  items="${department5}" var="department">
            <option selected="selected">${department.dName}</option>
          </c:forEach>
       </select></td>
    </tr>
    </table>
        <input type="submit" value="提交">
</form>
</body>
</html>
