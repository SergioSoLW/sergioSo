package com.sneaker.cass.controller.admin;

import com.sneaker.cass.Service.admin.AdminNewsService;
import com.sneaker.cass.Service.admin.Impl.AdminNewsServiceImpl;
import com.sneaker.cass.utils.ConfigUtils;
import com.sneaker.cass.utils.PageNaver;
import com.sneaker.cass.utils.PageSet;
import com.sneaker.cass.utils.ReqParasUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/newsList")
public class newsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminNewsService adminNewsService=new AdminNewsServiceImpl();
        int pno= ReqParasUtils.getInt("pno",1,req);
        PageSet ps=adminNewsService.selectNewsList(pno, ConfigUtils.MINPS);
        req.setAttribute("news",ps.getDataResult());
        req.setAttribute("pnav", PageNaver.getNaver(pno,ps.getPageCount(),"newsList?pno="));
        req.getRequestDispatcher("newslist.jsp").forward(req,resp);
    }
}
