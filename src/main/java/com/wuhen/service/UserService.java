package com.wuhen.service;

import com.wuhen.entity.User;

/**
 * 2020/7/26 10:28
 * by 无痕ぐ
 */
public interface UserService {
    User checkUser(String username,String password);
}
