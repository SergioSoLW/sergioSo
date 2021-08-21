package com.sneaker.cass.controller.admin;

import com.sneaker.cass.Service.admin.AdminNewsService;
import com.sneaker.cass.Service.admin.Impl.AdminNewsServiceImpl;
import com.sneaker.cass.utils.ReqParasUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/admin/news")
public class newsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int nid= ReqParasUtils.getInt("nid",1,req);
        AdminNewsService adminNewsService=new AdminNewsServiceImpl();
        Map<String,Object> rs=adminNewsService.getNews(nid);
        req.setAttribute("news",rs);
        req.getRequestDispatcher("news.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
