package com.sneaker.cass.DAO;

import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.PageSet;

import java.util.List;
import java.util.Map;

public interface newsDAO {
    public PageSet selectNewsList(int pno,int ps);
    public Map<String,Object> getNews(int nid);
}
