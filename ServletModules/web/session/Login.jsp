<%--
  Created by IntelliJ IDEA.
  User: dev5020
  Date: 2018/7/24
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<%
    String message = "";
    String msg = (String )request.getAttribute("msg");
    if(msg != null){
        message =msg;
    }
%>
<%=message%>

<!--提供登陆页面和信息，以及错误处理信息-->
<form action ="/ServletModules/LoginServlet" method="post">
    用户名： <input type="text" name="usrname"/><br/>
    密码： <input type="password" name="password"/><br/>
    <input type = "submit" value ="登陆" />
</form>

</body>
</html>
