package com.sneaker.cass.Service.impl;

import com.sneaker.cass.DAO.impl.newsDAOImpl;
import com.sneaker.cass.DAO.newsDAO;
import com.sneaker.cass.Service.newsService;
import com.sneaker.cass.utils.PageSet;

import java.util.List;
import java.util.Map;

public class newsServiceImpl implements newsService {
    newsDAO newsdao=new newsDAOImpl();
    @Override
    public PageSet selectNewsLIST(int pno, int ps) {

        return newsdao.selectNewsList(pno, ps);
    }

    @Override
    public Map<String, Object> selectNews(int nid) {
        return newsdao.getNews(nid);
    }
}
