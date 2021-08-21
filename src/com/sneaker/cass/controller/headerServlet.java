package com.sneaker.cass.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/header")
public class headerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String suname=null;
        suname=session.getAttribute("suname")!=null?session.getAttribute("suname").toString():null;
        if (suname!=null){
            req.setAttribute("suname",suname);
        }
        req.getRequestDispatcher("header.jsp").forward(req,resp);
    }
}
