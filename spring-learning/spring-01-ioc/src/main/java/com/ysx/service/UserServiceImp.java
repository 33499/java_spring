package com.ysx.service;

import com.ysx.dao.UserDao;
import com.ysx.dao.UserDaoImpl;
import com.ysx.dao.UserDaoMysqlIml;
import com.ysx.dao.UserDaoOracleIml;

public class UserServiceImp implements UserService{
    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void getUser() {
        userDao.geUser();
    }
}
