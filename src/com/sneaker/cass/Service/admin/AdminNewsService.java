package com.sneaker.cass.Service.admin;

import com.sneaker.cass.entity.News;
import com.sneaker.cass.utils.PageSet;

import java.util.Map;

public interface AdminNewsService {
    public PageSet selectNewsList(int pno,int ps);
    public Map<String,Object> getNews(int nid);
    public int insertNews(News news);
    public int updateNews(News news);
}
