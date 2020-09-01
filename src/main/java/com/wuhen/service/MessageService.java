package com.wuhen.service;

import com.wuhen.entity.Message;

import java.util.List;

/**
 * 2020/8/31 18:30
 * by 无痕ぐ
 */

public interface MessageService {

    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);

}