package com.sneaker.cass.utils;

public class StringUtils {
	public static String subMax2Len(String str){
		return str.length()>2? str.substring(1,3):str.length()==2?str.substring(1):str;
	}
}
