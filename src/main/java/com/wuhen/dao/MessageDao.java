package com.wuhen.dao;

import com.wuhen.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2020/8/31 18:29
 * by 无痕ぐ
 */
@Mapper
@Repository
public interface MessageDao {

    //添加一个评论
    int saveMessage(Message message);

    //查询父级评论
    List<Message> findByParentIdNull(@Param("ParentId") Long ParentId);

    //查询一级回复
    List<Message> findByParentIdNotNull(@Param("id") Long id);

    //查询二级以及所有子集回复
    List<Message> findByReplayId(@Param("childId") Long childId);

    //删除评论
    void deleteMessage(Long id);

}
