package com.wuhen.dao;

import com.wuhen.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2020/7/26 15:57
 * by 无痕ぐ
 */
@Mapper
@Repository
public interface TypeDao {
    int saveType(Type type);

    Type getType(Long id);

    List<Type> getAllType();

    List<Type> getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);
    Type getByName(String name);
}
