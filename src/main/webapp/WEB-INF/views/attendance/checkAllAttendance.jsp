<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/25
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看考情记录</title>
</head>

<body>
<table>
<c:forEach  items="${attendance3}" var="attendance">
    <tr>
        <td>
        员工id${attendance.empId}
        上班打卡时间 ${attendance.clockInTime}
        下班打卡时间 ${attendance.clockOutTime}<br/>
        </td>
    </tr>
</c:forEach>
</table>
<a class="btn  btn-primary" href="/post/departmentPost.view">返回</a>

</body>
</html>
