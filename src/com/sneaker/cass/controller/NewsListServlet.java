package com.sneaker.cass.controller;

import com.sneaker.cass.Service.impl.newsServiceImpl;
import com.sneaker.cass.Service.newsService;
import com.sneaker.cass.entity.News;
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
import java.util.List;
import java.util.Map;

@WebServlet("/newsList")
public class NewsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pno= ReqParasUtils.getInt("pno",1,req);
        newsService newsservice=new newsServiceImpl();
       // List<Map<String,Object>> news= newsService.selectNewsLIST();
        PageSet ps= newsservice.selectNewsLIST(pno, ConfigUtils.MINPS);

        req.setAttribute("news",ps.getDataResult());
        req.setAttribute("pnav",PageNaver.getNaver(pno,ps.getPageCount(),"newsList?pno="));
        req.getRequestDispatcher("newsList.jsp").forward(req,resp);
    }
}
