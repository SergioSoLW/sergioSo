package com.sneaker.cass.Service.admin;

import java.util.Map;

public interface adminService {
    public Map<String,Object> login(String aaccount,String apwd);
    public String getPwdByName(String aname);
    public int updatePwdByName(String npwd,String aname);
}
