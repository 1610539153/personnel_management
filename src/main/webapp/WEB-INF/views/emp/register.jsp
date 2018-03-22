<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/3/9
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工注册</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<c:forEach var="Interview" items="${interview3}">
    <h3><c:out value="${Interview.toString()}"></c:out></h3>
</c:forEach>
<h1>${interview4}</h1>
<form action="/emp/reg.do">
    用户名<input type="text"  name="empName"  required><br/>
    密码<input type="password" name="empPassword" required ><br/>
    <input type="submit" value="注册">
</form>

</body>
</html>
