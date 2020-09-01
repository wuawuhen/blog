package com.wuhen.service.impl;

import com.wuhen.dao.UserDao;
import com.wuhen.entity.User;
import com.wuhen.service.UserService;
import com.wuhen.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2020/7/26 10:29
 * by 无痕ぐ
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
