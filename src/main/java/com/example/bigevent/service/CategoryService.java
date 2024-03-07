package com.example.bigevent.service;

import com.example.bigevent.pojo.Category;

import java.util.List;

/**
 * @author xi
 * @create 2024/3/6 22:22
 */
public interface CategoryService {
    //新增分类
    void add(Category category);

    //列表查询
    List<Category> list();
}
