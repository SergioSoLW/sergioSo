package com.sneaker.cass.controller.Utils;

import com.google.gson.Gson;
import com.sneaker.cass.Service.impl.userServiceImpl;
import com.sneaker.cass.Service.userService;
import com.sneaker.cass.entity.jsonResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/checkEmailUtils")
public class CheckEmailUtils extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jsonResult jsonResult=new jsonResult();
        userService userservice =new userServiceImpl();
        Gson gson=new Gson();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        String email=req.getParameter("email");
        System.out.println("email:"+email);
        String emailfmt="[a-zA-Z0-9]+[@]+[0-9a-z]+[.]+[a-zA-z]{2,3}";
        if (email.matches(emailfmt)){

            boolean rs= userservice.checkUemail(email);
            System.out.println("rs=====->"+rs);
            if (!rs){
                jsonResult.setCode(1);
                jsonResult.setMsg("");
            }else {
                jsonResult.setMsg("该邮箱已被占用");
                jsonResult.setCode(0);
            }
        }else {
            jsonResult.setMsg("邮箱格式错误");
            jsonResult.setCode(0);
            System.out.println("不正确");
        }

        out.print(gson.toJson(jsonResult));
    }
}
