<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/18
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看简历</title>
</head>
<body>
<h1>${info8}</h1>
<form action="/resume/homePage.view">
    <c:forEach var="Resume" items="${info1}">
    <c:out value="${Resume}"></c:out>
</c:forEach>
    <input type="submit" value="返回">
</form>
</body>
</html>
