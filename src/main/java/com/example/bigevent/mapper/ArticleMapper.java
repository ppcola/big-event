package com.example.bigevent.mapper;

import com.example.bigevent.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xi
 * @create 2024/3/10 23:51
 */
@Mapper
public interface ArticleMapper {
    void add(Article article);
}
