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
import java.util.Map;

@WebServlet("/login")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService userservice=new userServiceImpl();
        Users users=new Users();
        String uemail=req.getParameter("uemail");
        String upwd=req.getParameter("upwd");
        System.out.println(uemail+"-----"+upwd);
        users.setUemail(uemail);
        users.setUpwd(upwd);
        Map<String,Object> rs=userservice.checkUser(users);
        System.out.println(rs);
        if (rs.isEmpty()){
            msg.erro("用户名或密码错误",req,resp);
        }else {
            HttpSession session=req.getSession();
            session.setAttribute("suname",rs.get("uname"));
            resp.sendRedirect("index");
        }
    }
}
