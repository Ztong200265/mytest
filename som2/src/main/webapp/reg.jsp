<%--
  Created by IntelliJ IDEA.
  User: 29268
  Date: 2021/11/30
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/param2/reg">
    用户名<input name="username"><br>
    密码<input name="pwd"><br>
    年龄<input name="age"><br>
    <input type="submit" value="reg">
</form>
</body>
</html>
