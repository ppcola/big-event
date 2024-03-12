package com.example.bigevent.controller;

import com.example.bigevent.pojo.Article;
import com.example.bigevent.pojo.PageBean;
import com.example.bigevent.pojo.Result;
import com.example.bigevent.service.ArticleService;
import com.example.bigevent.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author xi
 * @create 2024/3/5 19:25
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public Result<String> list(){

            return Result.success("所有文章数据...");


    }
    @PostMapping
    public Result add(@RequestBody Article article){
        articleService.add(article);
        return Result.success();

    }

    @GetMapping
    public Result<PageBean<Article>> list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false)String  state
    ){
        PageBean<Article> pb= articleService.list(pageNum,pageSize,categoryId,state);
        return Result.success(pb);
    }
}
