package com.sneaker.cass.Service;

import com.sneaker.cass.entity.Users;

import java.util.Map;

public interface userService {
    public Map<String,Object> checkUser(Users users);
    public boolean checkUemail(String uemail);
    public int addUser(Users users);
}
