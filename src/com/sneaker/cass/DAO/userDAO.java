package com.sneaker.cass.DAO;

import com.sneaker.cass.entity.Users;

import java.util.Map;

public interface userDAO {
    public Map<String,Object> checkuser(Users users);
    public boolean checkUemail(String uemail);
    public int addUser(Users users);
}
