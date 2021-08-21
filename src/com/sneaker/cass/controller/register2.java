package com.sneaker.cass.controller;

import com.sneaker.cass.Service.impl.userServiceImpl;
import com.sneaker.cass.Service.userService;
import com.sneaker.cass.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/registerUser")
public class register2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register2.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        Users users=new Users();
        userService userservice=new userServiceImpl();
        String uemail=null;
        if (session.getAttribute("remail")==null){
            resp.sendRedirect("registerEmail");
        }else {
           uemail= session.getAttribute("remail").toString();
        }

        System.out.println("loading...");
        System.out.println("uemail======>"+uemail);
        String upwd=req.getParameter("upwd2");
        int code =Integer.valueOf(req.getParameter("code")) ;
        System.out.println("ucode======>"+code);
        if (code==1){
            users.setUemail(uemail);
            users.setUpwd(upwd);
            int rs= userservice.addUser(users);
            if (rs>0){

                session.setAttribute("suname",users.getUname());
                resp.sendRedirect("index");

            }else {
                msg.erro("注册失败",req,resp);
            }

        }else {
            msg.erro("密码有空或不一致",req,resp);
        }
    }
}
