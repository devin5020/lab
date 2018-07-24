<%--
  Created by IntelliJ IDEA.
  User: dev5020
  Date: 2018/7/24
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取session</title>
</head>
<body>
<h1>获取session数据</h1>
<%
    String aaa = (String) session.getAttribute("aaa");

%>

<%=aaa %>


</body>
</html>
