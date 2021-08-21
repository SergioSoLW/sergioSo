package com.sneaker.cass.DAO.admin.impl;

import com.sneaker.cass.DAO.admin.adminDAO;
import com.sneaker.cass.utils.DbUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class adminDAOImpl implements adminDAO {
    DbUtils dbUtils=new DbUtils();
    @Override
    public Map<String,Object> login(String aaccount, String apwd) {
        String sql="select aid,aname from admin where aaccount=? and apwd=?";
        List<Object> paras=new ArrayList<Object>();
        paras.add(aaccount);
        paras.add(apwd);
        return dbUtils.queryOneRow(sql,paras);
    }

    @Override
    public String getPwdByName(String aname) {
        String sql="select apwd from admin where aname=?";
        List<Object> paras=new ArrayList<>();
        paras.add(aname);
        Map<String,Object> rs=dbUtils.queryOneRow(sql,paras);
        return rs.get("apwd").toString();
    }

    @Override
    public int updatePwdByName(String npwd, String aname) {
        String sql="update admin set apwd=? where aname=?";
        List<Object> paras=new ArrayList<>();
        paras.add(npwd);
        paras.add(aname);
        return dbUtils.update(sql,paras);
    }
}
