package com.zdy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;   //context对象
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*演示向servlet context保存数据*/
        //1 获取servletcontext对象
        //2 调用其setattribute方法完成保存
        ServletContext application = this.getServletContext();
        application.setAttribute( "name", "张三");

        //使用servletcontext获取参数
        String value = application.getInitParameter("context-param");
        System.out.println(value);

    }

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");



        //使用ServletConfig获取初始化参数
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));

        /*获取所有初始化参数*/
        Enumeration e = servletConfig.getInitParameterNames();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        super.init(servletConfig);

    }
}
