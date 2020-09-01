package com.wuhen.service;

import com.wuhen.entity.Type;

import java.util.List;

/**
 * 2020/8/31 13:12
 * by 无痕ぐ
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    List<Type>getAllType();

    List<Type>getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);


    Type getByName(String name);
}
