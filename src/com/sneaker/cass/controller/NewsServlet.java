package com.sneaker.cass.controller;

import com.sneaker.cass.Service.impl.newsServiceImpl;
import com.sneaker.cass.Service.newsService;
import com.sneaker.cass.utils.ReqParasUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/news")
public class NewsServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int nid= ReqParasUtils.getInt("nid",1,req);
        newsService newsservice=new newsServiceImpl();
        System.out.println("news---->"+newsservice.selectNews(nid));
        req.setAttribute("news",newsservice.selectNews(nid));
        req.getRequestDispatcher("news.jsp").forward(req,resp);
    }
}
