package com.wuhen.service.impl;

import com.wuhen.dao.TypeDao;
import com.wuhen.entity.Type;
import com.wuhen.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2020/7/26 15:55
 * by 无痕ぐ
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;




    @Override
    public int saveType(Type type) {
        return typeDao.saveType(type);
    }


    @Override
    public Type getType(Long id) {
        return typeDao.getType(id);
    }


    @Override
    public List<Type> getAllType() {
        return typeDao.getAllType();
    }

    @Override
    public List<Type> getAllTypeAndBlog() {
        return typeDao.getAllTypeAndBlog();
    }

    @Override
    public Type getByName(String name) {
        return typeDao.getByName(name);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeDao.getTypeByName(name);
    }


    @Override
    public int updateType(Type type) {
        return typeDao.updateType(type);
    }

    @Override
    public void deleteType(Long id) {
        typeDao.deleteType(id);
    }

}
