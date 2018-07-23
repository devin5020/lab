/*
   用于处理form表单，并将处理结果送到jsp显示
*/

package com.zdy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.CodingErrorAction;

public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取参数
        String  s1= request.getParameter("num1");
        String  s2 = request.getParameter("num2");
         //转换到int类型
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1+ num2;
         //将结果保存到request域
        request.setAttribute("result",sum);
        //转换到result.jsp
        request.getRequestDispatcher("/jia/result.jsp").forward(request,response);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
