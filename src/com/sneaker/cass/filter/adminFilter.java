package com.sneaker.cass.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class adminFilter implements Filter {
    private String state;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {//初始化
    state= filterConfig.getInitParameter("state"); //state="css,images,js"
    }
    public boolean checkUrl(String url){
        if (url.indexOf("login")>-1){
            return true;
        }else {
            String states[]=state.split(",");//通过 , 为标记来切割字符串
            for (String sta:states){
             if (url.indexOf(sta)>-1){
                 return true;
             }
            }
            return false;
        }

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse)servletResponse;

        String path=req.getRequestURI();
        if (checkUrl(path)){
            filterChain.doFilter(servletRequest,servletResponse );
        }else {
            Object osid= req.getSession().getAttribute("saname");
            if (osid==null){
                resp.sendRedirect("login");
            }else {
                filterChain.doFilter(servletRequest,servletResponse );
            }
        }

    }

    @Override
    public void destroy() {//注销过滤器

    }
}
