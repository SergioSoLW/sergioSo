package com.sneaker.cass.controller;

import com.sneaker.cass.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/registerEmail")
public class register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int code=Integer.valueOf(req.getParameter("code"));
        HttpSession session=req.getSession();

        if (code==1){
            String uemail=req.getParameter("uemail");
            session.setAttribute("remail",uemail);
            resp.sendRedirect("registerUser");
            //req.getRequestDispatcher("register2").forward(req,resp);
            System.out.println("uemail--->"+uemail);
        }else {
            msg.erro("邮箱格式错误或为空",req,resp);
        }
    }

}
