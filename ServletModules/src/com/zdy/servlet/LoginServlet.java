package com.zdy.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        //获取表单信息
        String usrname = request.getParameter("usrname");
        String password = request.getParameter("password");


        if("zdy".equalsIgnoreCase(usrname)){

            //如果登陆成功
            HttpSession session = request.getSession();
            session.setAttribute("usrname",usrname);  //向session域保存用户名
            response.sendRedirect("/ServletModules/session/succ1.jsp");


        } else{

            request.setAttribute("msg","用户名或密码错误");
            request.getRequestDispatcher("/session/Login.jsp").forward(request,response);  //得到转发器并转发

        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


    }
}
