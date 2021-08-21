package com.sneaker.cass.Service;

import com.sneaker.cass.utils.PageSet;

import java.util.List;
import java.util.Map;

public interface newsService {
    public PageSet selectNewsLIST(int pno, int ps);
    public Map<String,Object> selectNews(int nid);
}
