<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页面</title>
</head>
<body>
<h1>${admin1}</h1>
<h1>${department3}</h1>
<h1>${department2}</h1>
<h1>${post1}</h1>
<h1>${recruit1}</h1>
<h1>${recruit4}</h1>
<c:forEach var="RecruitMessage" items="${recruit5}">
    <h3><c:out value="${RecruitMessage.toString()}"></c:out></h3>
</c:forEach>
<c:forEach var="PutResume" items="${putResume1}">
    <h3><c:out value="${PutResume.toString()}"></c:out></h3>
</c:forEach>
<c:forEach var="Train" items="${train6}">
    <h3><c:out value="${Train.toString()}"></c:out></h3>
</c:forEach>
<c:forEach var="Emp" items="${emp4}">
    <h3><c:out value="${Emp.toString()}"></c:out></h3>
</c:forEach>
<h1>${deleteMyRecruitMessage1}</h1>
<h1>${interview1}</h1>
<h1>${putResume4}</h1>
<h1>${train1}</h1>
<h1>${train5}</h1>
<h1>${train7}</h1>
<h1>${train3}</h1>
<h1>${emp5}</h1>
<h1>${emp6}</h1>
<h1>${department6}</h1>
<h1>${department8}</h1>
<h1>${post3}</h1>
<h1>${post4}</h1>
<h1>${emp7}</h1>
<h1>${attendance3}</h1>
<h1>${fine1}</h1>
<h1>${attendance4}</h1>
<h1>${attendance6}</h1>
<h1>${salSettlement1}</h1>

<c:forEach var="attendance" items="${attendance5}">
    <h3><c:out value="${attendance.toString()}"></c:out></h3>
</c:forEach>
<a class="btn  btn-primary" href="/department/additionDepartment.view">添加部门</a>
<a class="btn  btn-primary" href="/department/checkDepartment.view">查看部门</a>
<a class="btn  btn-primary" href="/department/additionPost.View">添加职位</a>
<a class="btn  btn-primary" href="/post/checkAllPost.View">查看职位</a>
<a class="btn  btn-primary" href="/recruitMessage/recruit.view">发布招聘</a>
<a class="btn  btn-primary" href="/recruitMessage/checkMyRecruit.view">查看我的招聘信息</a>
<a class="btn  btn-primary" href="/recruitMessage/deleteMyRecruit.view">删除我的招聘信息</a>
<a class="btn  btn-primary" href="/putResume/checkPutResume.view">查看投放的简历</a>
<a class="btn  btn-primary" href="/putResume/additionInterview.view">添加面试消息</a>
<a class="btn  btn-primary" href="/train/additionTrain.view">添加培训内容</a>
<a class="btn  btn-primary" href="/train/checkMyTrain.view">查看我发布的培训内容</a>
<a class="btn  btn-primary" href="/train/deleteMyTrain.view">删除我发布的培训内容</a>
<a class="btn  btn-primary" href="/train/updateMyTrain.view">修改我发布的培训内容</a>
<a class="btn  btn-primary" href="/emp/checkEmp.view">查看所有员工</a>
<a class="btn  btn-primary" href="/department/checkDepartmentUpdateEmp.view">修改员工信息</a>
<a class="btn  btn-primary" href="/emp/frostEmp.view">冻结员工</a>
<a class="btn  btn-primary" href="/attendance/checkAllAttendance.view">查看所有考情</a>
<a class="btn  btn-primary" href="/attendance/checkSomeoneAttendance.view">查看某员工的考情</a>
<a class="btn  btn-primary" href="/attendance/wageCalculation.view">工资结算</a>
<a class="btn  btn-primary" href="/salSettlement/salaryRelease.view">工资发布</a>

</body>
</html>
