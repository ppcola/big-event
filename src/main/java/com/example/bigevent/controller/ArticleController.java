package com.example.bigevent.controller;

import com.example.bigevent.pojo.Article;
import com.example.bigevent.pojo.Result;
import com.example.bigevent.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author xi
 * @create 2024/3/5 19:25
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @GetMapping("/list")
    public Result<String> list(){

            return Result.success("所有文章数据...");


    }
    @PutMapping
    public Result add(@RequestBody Article article){
        return Result.success();
    }
}
