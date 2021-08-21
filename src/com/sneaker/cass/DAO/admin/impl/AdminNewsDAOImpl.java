package com.sneaker.cass.DAO.admin.impl;

import com.sneaker.cass.DAO.admin.AdminNewsDAO;
import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.DbUtils;
import com.sneaker.cass.utils.PageNaver;
import com.sneaker.cass.utils.PageSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminNewsDAOImpl implements AdminNewsDAO {
    DbUtils dbUtils=new DbUtils();
    @Override
    public PageSet selectNewsList(int pno, int ps) {
        String sql="select * from news";
        return dbUtils.queryPage(sql,null,pno,ps);
    }

    @Override
    public Map<String, Object> getNews(int nid) {
        String sql="select * from news where nid=?";
        List<Object> paras=new ArrayList<>();
        paras.add(nid);

        return dbUtils.queryOneRow(sql,paras);
    }

    @Override
    public int insertNews(News news) {
        String sql="insert into news(nimg1,ntitle,ndate,ndesc,ncontent,naddress) values(?,?,?,?,?,?)";
        List<Object> paras=new ArrayList<>();
        paras.add(news.getNimg1());
        paras.add(news.getNtitle());
        paras.add(news.getNdate());
        paras.add(news.getNdesc());
        paras.add(news.getContent());
        paras.add(news.getNaddress());
        return dbUtils.insertReturnID(sql,paras);
    }

    @Override
    public int updateNews(News news) {
        String sql="update news set ntitle=?,naddress=?,ndesc=?,ndate=?,ncontent=?,nimg1=? where nid=?";
        List<Object> paras=new ArrayList<>();
        paras.add(news.getNtitle());

        paras.add(news.getNaddress());
        paras.add(news.getNdesc());
        paras.add(news.getNdate());
        paras.add(news.getContent());
        paras.add(news.getNimg1());
        paras.add(news.getNid());
        return dbUtils.update(sql,paras);
    }
}
