package com.wuhen.service;

import com.wuhen.entity.Comment;

import java.util.List;

/**
 * 2020/8/31 12:35
 * by 无痕ぐ
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    int saveComment(Comment comment);

//    查询子评论
//    List<Comment> getChildComment(Long blogId,Long id);

    //删除评论
    void deleteComment(Comment comment,Long id);
}
