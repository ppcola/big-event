package com.example.bigevent.service.impl;

import com.example.bigevent.mapper.ArticleMapper;
import com.example.bigevent.pojo.Article;
import com.example.bigevent.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author xi
 * @create 2024/3/10 23:50
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public void add(Article article) {
        //补充属性值
        article.setCreateTime(LocalDateTime.now());
        articleMapper.add(article);
    }
}
