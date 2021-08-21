package com.sneaker.cass.DAO.admin;

import java.util.List;
import java.util.Map;

public interface adminDAO {
    public Map<String,Object> login(String aaccount, String apwd);
    public String getPwdByName(String aname);
    public int updatePwdByName(String npwd,String aname);
}
