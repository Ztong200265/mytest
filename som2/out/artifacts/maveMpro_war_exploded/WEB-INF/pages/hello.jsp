<%--
  Created by IntelliJ IDEA.
  User: 29268
  Date: 2021/11/27
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/user/upload.do">
        上传图片： <input type="file" name="image"/><br>
        <input type="submit" value="上传">
    </form>
</div>

<div>
    <form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/user/upload2.do">
        上传图片1： <input type="file" name="image"/><br>
        上传图片2： <input type="file" name="image"/><br>
        上传图片3： <input type="file" name="image"/><br>
        <input type="submit" value="批量上传">
    </form>
</div>

<%--hello${requestScope.username}!!!你今年${requestScope.age}岁--%>

</body>
</html>
