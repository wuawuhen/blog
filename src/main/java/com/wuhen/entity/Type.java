package com.wuhen.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 2020/7/26 8:30
 * by 无痕ぐ
 */
public class Type {
    private  Long id;
    private  String name;

    public Type() {
    }

    private List<Blog> blogs=new ArrayList<>();
    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
