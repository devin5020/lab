package com.zdy.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*演示向servlet context保存数据*/
        //1 获取servletcontext对象
        //2 调用其getattribute方法获取数据
        ServletContext application = this.getServletContext();
        String name = (String )application.getAttribute("name");

        System.out.println(name);
    }
}
