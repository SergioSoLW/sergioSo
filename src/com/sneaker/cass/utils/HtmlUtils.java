package com.sneaker.cass.utils;

public class HtmlUtils {
	public static String doXSS(String msg){
		return msg.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}
}
