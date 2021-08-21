package com.sneaker.cass.utils;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

public class JsUtils {
	public void jsBack(JspWriter out,String msg){
	try {
		out.println("<script>alert('"+msg+"');history.back();</script>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void jsGo(JspWriter out,String msg,String url){
		try {
			out.println("<script>alert('"+msg+"');location.href='"+url+"';</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public void erro(JspWriter out,String msg){

		}
	
	
}
