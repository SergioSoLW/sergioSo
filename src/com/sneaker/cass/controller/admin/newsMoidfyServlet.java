package com.sneaker.cass.controller.admin;

import com.sneaker.cass.Service.admin.AdminNewsService;
import com.sneaker.cass.Service.admin.Impl.AdminNewsServiceImpl;
import com.sneaker.cass.controller.msg;
import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.ReqParasUtils;
import com.sneaker.cass.utils.UploadUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@WebServlet("/admin/newsModify")
public class newsMoidfyServlet extends HttpServlet {
    AdminNewsService adminNewsService=new AdminNewsServiceImpl();
    Map<String,Object> rs;
    int nid;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UploadUtil uploadUtil=new UploadUtil(getServletContext(),req);
        nid= ReqParasUtils.getInt("nid",33,req);
        rs=adminNewsService.getNews(nid);

        req.setAttribute("news",rs);
        req.getRequestDispatcher("newsModify.jsp").forward(req,resp);
        System.out.println("rs--->"+rs);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        News news=new News();
        AdminNewsService adminNewsService=new AdminNewsServiceImpl();
        UploadUtil uploadUtil=new UploadUtil(getServletContext(),req);

        int aid = Integer.valueOf(session.getAttribute("said").toString());
        String aname= session.getAttribute("saname").toString();

        System.out.println("发布页--->"+aid+"--aname:"+aname);


        Map<String,String> paths=null;
        try {
            paths=uploadUtil.upload2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String nimg1;
        System.out.println("图片："+paths);
        if (paths.size()==0){
            nimg1=rs.get("nimg1").toString();
        }else {
            nimg1= paths.get("nimg1");
        }

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

        if (code1==0||code2==0||code3==0||code4==0){
            msg.erro("表单中有空或格式不正确",req,resp);

        }else {
            news.setContent(ncontent);
            news.setNaddress(aname);
            news.setNdate(fdate);
            news.setNdesc(ndesc);
            news.setNimg1(nimg1);
            news.setNtitle(ntitle);
            news.setNid(nid);

            int rs= adminNewsService.updateNews(news);
            if (rs>0){
                System.out.println("成功");
                resp.sendRedirect("newsAdd");
            }else {
                msg.erro("修改失败",req,resp);
            }
        }
    }
}
