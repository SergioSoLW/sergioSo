package com.sneaker.cass.controller;

import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.DbUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestDAO {


    public static void main(String[] args) {
        DbUtils dbUtils=new DbUtils();
//        News news=new News();
//        //String sql="select nid,nimg1,ntitle,ndesc,ndate from news";
//        String sql="select aid,aname from admin where aaccount=? and apwd=?";
//        List<Object> paras=new ArrayList<>();
//        paras.add("TYDHG");
//        paras.add("123123");
//        Map<String,Object> rs= dbUtils.queryOneRow(sql,paras);
        String uemail="244775244@qq.com";
        String upwd="123";
        String sql="insert into user(uemail,upwd,udate) values(?,?,now())";
        List<Object> paras=new ArrayList<>();
        paras.add(uemail);
        paras.add(upwd);
        int rs= dbUtils.insertReturnID(sql,paras);

        System.out.println("-------"+rs);
    }

}
