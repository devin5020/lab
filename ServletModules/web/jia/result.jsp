<%--
  Created by IntelliJ IDEA.
  User: dev5020
  Date: 2018/7/23
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>

<%
    Integer result = (Integer ) request.getAttribute("result");
%>
<%=result
%>

</body>
</html>
