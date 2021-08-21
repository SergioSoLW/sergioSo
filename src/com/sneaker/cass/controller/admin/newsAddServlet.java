package com.sneaker.cass.controller.admin;

import com.google.gson.Gson;
import com.sneaker.cass.Service.admin.AdminNewsService;
import com.sneaker.cass.Service.admin.Impl.AdminNewsServiceImpl;
import com.sneaker.cass.controller.msg;
import com.sneaker.cass.entity.News;
import com.sneaker.cass.entity.jsonResult;
import com.sneaker.cass.utils.UploadUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.SimpleFormatter;

@WebServlet("/admin/newsAdd")
public class newsAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("newsAdd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String aname= session.getAttribute("saname").toString();
        News news=new News();
        AdminNewsService adminNewsService=new AdminNewsServiceImpl();
        UploadUtil uploadUtil=new UploadUtil(getServletContext(),req);


        int aid = Integer.valueOf(session.getAttribute("said").toString());


        System.out.println("发布页--->"+aid+"--aname:"+aname);


        Map<String,String> paths=null;
        try {
            paths=uploadUtil.upload2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String nimg1= paths.get("nimg1");
        System.out.println("图片："+paths);

        String ntitle=uploadUtil.getParameter("ntitle");
        String ndesc=uploadUtil.getParameter("ndesc");
        String ncontent=uploadUtil.getParameter("ncontent");
        String ndate=uploadUtil.getParameter("ndate2");
        System.out.println("日期:"+ndate);
        System.out.println("标题:"+ntitle);
        int code1=Integer.valueOf(uploadUtil.getParameter("code1"));
        int code2=Integer.valueOf(uploadUtil.getParameter("code2"));
        int code3=Integer.valueOf(uploadUtil.getParameter("code3"));
        int code4=Integer.valueOf(uploadUtil.getParameter("code4"));

        //日期转换
        SimpleDateFormat spf=new SimpleDateFormat("yyyy-MM-dd");
        Date fdate=null;
        try {
            fdate=spf.parse(ndate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (paths.size()==0){
            msg.erro("图片不能为空",req,resp);
            return;
        }
        if (code1==0||code2==0||code3==0||code4==0){
            msg.erro("表单中有空或格式不正确",req,resp);

        }else {
            news.setContent(ncontent);
            news.setNaddress(aname);
            news.setNdate(fdate);
            news.setNdesc(ndesc);
            news.setNimg1(nimg1);
            news.setNtitle(ntitle);

            int rs= adminNewsService.insertNews(news);
            if (rs>0){
                System.out.println("成功");
                resp.sendRedirect("newsAdd");
            }else {
                msg.erro("添加失败",req,resp);
            }
        }

    }
}
