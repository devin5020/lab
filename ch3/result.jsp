<%@ page import ="java.util.*" %>

<html>
<body>
<h1 align="center"> Beer Recommandations JSP</h1>
</body>
<p>

<%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();

        while(it.hasNext()){
            out.print("<br>try: " + it.next());
        }

%>

</html>