package com.sneaker.cass.controller.Utils;

import com.google.gson.Gson;
import com.sneaker.cass.entity.jsonResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Utils/CheckDate")
public class CheckDateUtils extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jsonResult jsonresult=new jsonResult();
        Gson gson=new Gson();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        String datemt="[0-9]{4}-[0-9]{2}-[0-9]{2}";

        String date=req.getParameter("date");
        //System.out.println("ndata=====>"+ndate);
        if (!date.matches(datemt)){
            System.out.println("判断格式"+date.matches(datemt));
            jsonresult.setCode(0);
            jsonresult.setMsg("日期格式不正确,应为:yyyy-mm-dd");
        }else {
            jsonresult.setCode(1);
            jsonresult.setMsg("");
        }


        out.print(gson.toJson(jsonresult));
    }
}
