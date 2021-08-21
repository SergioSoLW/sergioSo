package com.sneaker.cass.DAO.impl;

import com.sneaker.cass.DAO.userDAO;
import com.sneaker.cass.entity.Users;
import com.sneaker.cass.utils.DbUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class userDAOImpl implements userDAO {
    DbUtils dbUtils=new DbUtils();
    @Override
    public Map<String, Object> checkuser(Users users) {
        String sql="select * from user where uemail=? and upwd=?";
        List<Object> paras=new ArrayList<>();
        paras.add(users.getUemail());
        paras.add(users.getUpwd());
        return dbUtils.queryOneRow(sql,paras);
    }

    @Override
    public boolean checkUemail(String uemail) {
        String sql="select uemail from user where uemail=?";
        List<Object> paras=new ArrayList<>();
        paras.add(uemail);
        Object rs= dbUtils.queryOne(sql,paras);
        return rs==null?false:true;
    }

    @Override
    public int addUser(Users users) {
        String sql="insert into user(uemail,upwd,udate) values(?,?,now())";
        List<Object> paras=new ArrayList<>();
        paras.add(users.getUemail());
        paras.add(users.getUpwd());
        return dbUtils.insertReturnID(sql,paras);
    }
}
