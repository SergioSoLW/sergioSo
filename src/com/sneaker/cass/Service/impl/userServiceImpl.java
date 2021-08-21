package com.sneaker.cass.Service.impl;

import com.sneaker.cass.DAO.impl.userDAOImpl;
import com.sneaker.cass.DAO.userDAO;
import com.sneaker.cass.Service.userService;
import com.sneaker.cass.entity.Users;

import java.util.List;
import java.util.Map;

public class userServiceImpl implements userService {
    userDAO userdao=new userDAOImpl();
    @Override
    public Map<String, Object> checkUser(Users users) {

        return userdao.checkuser(users);
    }

    @Override
    public boolean checkUemail(String uemail) {
        return userdao.checkUemail(uemail);
    }

    @Override
    public int addUser(Users users) {
        return userdao.addUser(users);
    }
}
