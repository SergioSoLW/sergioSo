package com.sneaker.cass.controller.admin;

import com.sneaker.cass.Service.admin.adminService;
import com.sneaker.cass.Service.admin.Impl.adminServiceImpl;
import com.sneaker.cass.controller.msg;
import com.sneaker.cass.utils.JsUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.util.Map;

@WebServlet("/admin/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

   // @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JsUtils jsutils=new JsUtils();
        JspWriter out=null;
        adminService adminservice=new adminServiceImpl();
        String aaccount=req.getParameter("aaccount");
        String apwd=req.getParameter("apwd");
        System.out.println(aaccount+"---"+apwd);
        if (aaccount=="" || apwd==""){

            msg.erro("不为空",req,resp);
            //jsutils.jsBack(out,"账号或密码不能为空");
        }else{
             Map<String,Object> rs= adminservice.login(aaccount,apwd);
             System.out.println("rs===================>"+rs);
             if (!rs.isEmpty()){
                 System.out.println("rs!=null===================>"+rs);
                 resp.sendRedirect("index");
                 HttpSession session=req.getSession();

                 session.setAttribute("said",rs.get("aid"));
                 session.setAttribute("saname",rs.get("aname"));
                 System.out.println("admin====>"+rs.get("aid")+"-----"+rs.get("aname"));
             }else {
                // jsutils.jsBack(out,"密码账号不正确");
                 msg.erro("密码账号错误",req,resp);
             }

        }



    }
}
