package com.sneaker.cass.Service.admin.Impl;

import com.sneaker.cass.DAO.admin.adminDAO;
import com.sneaker.cass.DAO.admin.impl.adminDAOImpl;
import com.sneaker.cass.Service.admin.adminService;

import java.util.Map;

public class adminServiceImpl implements adminService {
    adminDAO admindao=new adminDAOImpl();
    @Override
    public Map<String, Object> login(String aaccount, String apwd) {
        return admindao.login(aaccount,apwd);
    }

    @Override
    public String getPwdByName(String aname) {
        return admindao.getPwdByName(aname);
    }

    @Override
    public int updatePwdByName(String npwd, String aname) {
        return admindao.updatePwdByName(npwd,aname);
    }
}
