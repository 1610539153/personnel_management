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
      职位名称 <select name="postName" >
          <option value ="总经理">总经理</option>
          <option value ="副经理">副经理</option>
          <option value ="大管理">大管理</option>
          <option value ="小管理">小管理</option>
          <option value ="组长">组长</option>
          <option value ="成员">成员</option>
      </select>
      <input type="submit" value="提交">
  </form>
</body>
</html>
