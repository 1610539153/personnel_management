<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/22
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工主页面</title>
</head>
<body>
<h1>${emp1}</h1>
<h1>${train3}</h1>
<h1>${trainWordList1}</h1>
<h1>${attendance1}</h1>
<h1>${attendance2}</h1>
<h1>${attendance3}</h1>
<h1>${fine1}</h1>
<h1>${question}</h1>
<c:forEach var="AttendanceQuestion" items="${question1}">
    <h3><c:out value="${AttendanceQuestion.toString()}"></c:out></h3>
</c:forEach>
<a  class="btn  btn-primary" href="/train/checkTrainContent.view">查看培训内容</a>
<a  class="btn  btn-primary" href="/attendance/startWorkAttendance.view">上班打卡</a>
<a  class="btn  btn-primary" href="/attendance/closedAttendance.view">下班打卡</a>
<a  class="btn  btn-primary" href="/attendanceQuestion/checkAttendanceQuestion.view">查看我的奖惩信息</a>
</body>
</html>
