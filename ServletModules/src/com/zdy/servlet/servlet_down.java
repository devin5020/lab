package com.zdy.servlet;

import org.omg.CORBA.portable.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet_down extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //设置编码格式
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        response.setHeader("Content-Disposition", "attachment; filename=ddd.jpg");

 /*       response.setDateHeader("Expires",-1);
        response.setDateHeader("Expires",System.currentTimeMillis()+3600); //1小时后刷新
        //保持兼容性
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Pragma","no-cache");*/


        // 获取到要下载文件的全路径
        String path = this.getServletContext().getRealPath("/images/ddd.jpg");
       // System.out.println("path="+path) ;
        //读文件到内存，输入流
        FileInputStream fis = new FileInputStream(path);
         //做一个缓冲字节数组
        byte buff[] = new byte[1024];


        int len = 0; //实际每次读取了多少个字节的数据
        java.io.OutputStream os = response.getOutputStream();
        while((len = fis.read(buff))> 0){
            os.write(buff,0,len);

        }
        //关闭
        os.close();
        fis.close();

    }


}

