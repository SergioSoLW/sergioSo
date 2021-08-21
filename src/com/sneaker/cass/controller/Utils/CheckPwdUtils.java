package com.sneaker.cass.controller.Utils;


import com.google.gson.Gson;
import com.sneaker.cass.Service.admin.Impl.adminServiceImpl;
import com.sneaker.cass.Service.admin.adminService;
import com.sneaker.cass.entity.jsonResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Utils/CheckPwdUtils")
public class CheckPwdUtils extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        adminService adminservice=new adminServiceImpl();
        jsonResult jsonresult=new jsonResult();
        Gson gson=new Gson();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        String opwd=req.getParameter("opwd");
        HttpSession session=req.getSession();
        String sname= session.getAttribute("saname").toString();
        String pwd=adminservice.getPwdByName(sname);
        System.out.println("opwd--"+opwd);
        if (opwd.equals(pwd)){
            jsonresult.setCode(1);
            jsonresult.setMsg("");
        }else {
            jsonresult.setCode(0);
            jsonresult.setMsg("密码错误");
        }
        out.print(gson.toJson(jsonresult));
    }
}
