需要的页面：
	login.jsp：登录页面，提供登录表单；
	succ1.jsp：主页，显示当前用户名称，如果没有登录，显示您还没登录；
	succ2.jsp：主页，显示当前用户名称，如果没有登录，显示您还没登录；

Servlet：
	LoginServlet：在login.jsp页面提交表单时，请求本Servlet。在本Servlet中获取用户名、密码进行校验，如果用户名、密码错误，显示“用户名或密码错误”，如果正确保存用户名session中，然后重定向到index1.jsp；

　　当用户没有登录时访问index1.jsp或index2.jsp，显示“您还没有登录”。如果用户在login.jsp登录成功后到达index1.jsp页面会显示当前用户名，而且不用再次登录去访问index2.jsp也会显示用户名。因为多次请求在一个会话范围，index1.jsp和index2.jsp都会到session中获取用户名，session对象在一个会话中是相同的，所以都可以获取到用户名！
