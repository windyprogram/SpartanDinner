<%--
  Created by IntelliJ IDEA.
  User: Wind
  Date: 2016/3/18
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title></title>
</head>
<body>
${dish.dishId}<br/>
${dish.dishName}<br/>
${dish.dishPrice}
</body>
</html>
