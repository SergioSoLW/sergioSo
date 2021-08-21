package com.sneaker.cass.controller.admin;

import com.sneaker.cass.Service.admin.Impl.adminServiceImpl;
import com.sneaker.cass.Service.admin.adminService;
import com.sneaker.cass.controller.msg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin/adminUpdate")
public class adminUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("adminUpdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        adminService aadminservice=new adminServiceImpl();
        HttpSession session=req.getSession();
        String sname= session.getAttribute("saname").toString();
        String npwd=req.getParameter("npwd2");
        int code=Integer.valueOf(req.getParameter("code1"));
        System.out.println(npwd);
        if (code==1){
            int rs= aadminservice.updatePwdByName(npwd,sname);
            if (rs>0){
                resp.sendRedirect("main.jsp");
            }else {
                msg.erro("修改失败",req,resp);
            }
        }else {
            msg.erro("密码有误",req,resp);
        }

    }
}
