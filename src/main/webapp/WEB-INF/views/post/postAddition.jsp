<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加职位</title>
</head>

<body>
  <form action="/post/additionPost.do">
      职位名称<input type="text" name="postName" required><br/>
      <input type="submit" value="提交">
  </form>
</body>
</html>
