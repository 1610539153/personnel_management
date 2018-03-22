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
<h1>${deleteMyRecruitMessage1}</h1>
<h1>${interview1}</h1>
<h1>${putResume3}</h1>
<h1>${putResume4}</h1>
<a class="btn  btn-primary" href="/department/additionDepartment.view">添加部门</a>
<a class="btn  btn-primary" href="/post/additionPost.View">添加职位</a>
<a class="btn  btn-primary" href="/recruitMessage/recruit.view">发布招聘</a>
<a class="btn  btn-primary" href="/recruitMessage/checkMyRecruit.view">查看我的招聘信息</a>
<a class="btn  btn-primary" href="/recruitMessage/deleteMyRecruit.view">删除我的招聘信息</a>
<a class="btn  btn-primary" href="/putResume/checkPutResume.view">查看投放的简历</a>
<a class="btn  btn-primary" href="/putResume/additionInterview.view">添加面试消息</a>
</body>
</html>
