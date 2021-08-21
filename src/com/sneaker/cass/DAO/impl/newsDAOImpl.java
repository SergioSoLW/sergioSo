package com.sneaker.cass.DAO.impl;

import com.sneaker.cass.DAO.newsDAO;
import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.DbUtils;
import com.sneaker.cass.utils.PageSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class newsDAOImpl implements newsDAO {
    DbUtils dbUtils=new DbUtils();
    @Override
    public PageSet selectNewsList(int pno,int ps) {
        News news=new News();
        String sql="select nid,nimg1,ntitle,ndesc,ndate from news order by nid desc";
        return  dbUtils.queryPage(sql,null,pno,ps);
    }

    @Override
    public Map<String,Object> getNews(int nid) {
        String sql="select * from news where nid=?";
        List<Object> paras=new ArrayList<Object>();
        paras.add(nid);
        return dbUtils.queryOneRow(sql,paras);
    }
}
