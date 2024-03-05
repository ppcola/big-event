package com.example.bigevent.controller;

import com.example.bigevent.pojo.Result;
import com.example.bigevent.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
