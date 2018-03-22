<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/18
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<h1>${info2}</h1>
<h1>${info3}</h1>
<h1>${recruit2}</h1>
<h1>${putResume2}</h1>
<h1>${putResume6}</h1>
<h1>${interview2}</h1>
<c:forEach var="RecruitMessage" items="${recruit3}">
    <h3><c:out value="${RecruitMessage.toString()}"></c:out></h3>
</c:forEach>
<a class="btn  btn-primary" href="/resume/write.view">填写简历</a>
<a class="btn  btn-primary" href="/resume/checkResume.view">查看简历</a>
<a class="btn  btn-primary" href="/resume/update.view">修改简历</a>
<a class="btn  btn-primary" href="/recruitMessage/checkRecruit.view">查看招聘信息</a>
<a class="btn  btn-primary" href="/resume/putResume.view">投放简历</a>
<a class="btn  btn-primary" href="/interview/checkMyInterview.view">查看我的面试消息</a>



</body>
</html>
