<%--
  Created by IntelliJ IDEA.
  User: mr.chan
  Date: 2019-12-16
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ych-shiro/user/login" method="post">
    用户名：<input type="text" name="userName" value="zhang"/><br/>
    密码：<input type="password" name="password" value="123456"/><br/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
