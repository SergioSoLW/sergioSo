package com.sneaker.cass.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class msg extends HttpServlet {

    public static void erro(String msg,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.sendRedirect("erro.jsp");
        req.setAttribute("msg",msg);
        req.getRequestDispatcher("erro.jsp").forward(req,resp);


    }
    public static void success(String msg,String url,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.sendRedirect("erro.jsp");
        req.setAttribute("msg",msg);
        req.setAttribute("url",url);
        req.getRequestDispatcher("success.jsp").forward(req,resp);


    }
}
