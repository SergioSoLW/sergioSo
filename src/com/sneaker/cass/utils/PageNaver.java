package com.sneaker.cass.utils;

public class PageNaver {
	public static String getNaver(int pno,int maxP,String url){
		String naver="";
		int pre=pno>1?pno-1:1;
		int next=pno<maxP?pno+1:maxP;
		naver="<a href='"+url+pre+"'>&lt;</a>";
		int height=3;
		int s=pno-(height-1)/2;
		int e=pno+(height-1)/2;
		if(maxP<=height){
			s=1;
			e=maxP;
		}
		else{
			if(s<1){
			int sl=1-s;
			s=1;
			e=e+sl;
			}
			if(e>maxP){
				s=s-(e-maxP);
				e=maxP;
			}
		}
		for(int i=s;i<=e;i++){naver=naver+"<a href='"+url+i+"'>"+i+"</a>";}
		if(e<maxP){naver=naver+"<span>..</span>";}
		naver=naver+"<a href='"+url+next+"'>&gt;</a>";
		return naver;
	}
}
