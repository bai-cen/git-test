package com.yjxxt.service;

import com.yjxxt.bean.User;
import com.yjxxt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public class UserService {

    @Resource(name = "userDao")
    UserDao userDao;
//    private UserDao userDao;


//    public void setuserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test2(){
        userDao.test();
        System.out.println("UserService....");
    }


}
