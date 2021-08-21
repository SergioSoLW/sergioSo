package com.sneaker.cass.Service.admin.Impl;

import com.sneaker.cass.DAO.admin.AdminNewsDAO;
import com.sneaker.cass.DAO.admin.impl.AdminNewsDAOImpl;
import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.PageSet;

import java.util.Map;

public class AdminNewsServiceImpl implements com.sneaker.cass.Service.admin.AdminNewsService {
    AdminNewsDAO adminNewsDAO=new AdminNewsDAOImpl();
    @Override
    public PageSet selectNewsList(int pno, int ps) {
        return adminNewsDAO.selectNewsList(pno,ps);
    }

    @Override
    public Map<String, Object> getNews(int nid) {
        return adminNewsDAO.getNews(nid);
    }

    @Override
    public int insertNews(News news) {
        return adminNewsDAO.insertNews(news);
    }

    @Override
    public int updateNews(News news) {
        return adminNewsDAO.updateNews(news);
    }
}
