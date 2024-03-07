package com.example.bigevent.controller;

import com.example.bigevent.pojo.Category;
import com.example.bigevent.pojo.Result;
import com.example.bigevent.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xi
 * @create 2024/3/6 22:20
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public Result add(@RequestBody Category category){
        categoryService.add(category);
        return Result.success();
    }

    @GetMapping
    public Result<List<Category>> list(){
        List<Category> cs =categoryService.list();
        return Result.success(cs);

    }
}
