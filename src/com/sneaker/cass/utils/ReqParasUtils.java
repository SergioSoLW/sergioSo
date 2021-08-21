package com.sneaker.cass.utils;

import javax.servlet.http.HttpServletRequest;

public class ReqParasUtils {
    public static int getInt(String pName,int defVal,HttpServletRequest req){
        return req.getParameter(pName)==null?defVal:Integer.valueOf(req.getParameter(pName));
    }
    public static String getString(String pName,String defVal,HttpServletRequest req){
        return req.getParameter(pName)==null?defVal:req.getParameter(pName);
    }
}
