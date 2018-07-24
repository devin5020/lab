<%--
  Created by IntelliJ IDEA.
  User: dev5020
  Date: 2018/7/24
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功1</title>
</head>
<body>
<h1>登陆成功</h1>>

<%
   String name=(String)session.getAttribute("usrname");
   if(name == null){
       request.setAttribute("msg","你还没有登陆，请不要冒充领导");
       request.getRequestDispatcher("/session/Login.jsp").forward(request,response);

       return;
   }

%>
欢迎<%=name%>指导工作！

</body>
</html>
