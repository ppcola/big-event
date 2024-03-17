package com.example.bigevent.controller;

import com.example.bigevent.vo.ArticleVo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xi
 * @create 2024/3/17 23:12
 */
@RestController
@RequestMapping("articleVo")
@CrossOrigin//支持跨域
public class AritcleVoController {
    private List<ArticleVo> articleVoList = new ArrayList<>();
//构造代码块
    {
        articleVoList.add(new ArticleVo("警方通报7名大学生持棍追打中学生","时事","2024年3月17日","已发布"));
        articleVoList.add(new ArticleVo("交警被路人同款反光外套逗笑","时事","2024年3月17日","草稿"));
        articleVoList.add(new ArticleVo("各地陆续进入春耕时节","时事","2024年3月17日","已发布"));

    }

//    新增文章

    @PostMapping("/add")
    public String add(@RequestBody ArticleVo articleVo){
        articleVoList.add(articleVo);
        return "新增成功";
    }

    //获取所有文章信息
    @GetMapping("/getAll")
    public List<ArticleVo> getAll(){
        return articleVoList;
    }

    //根据文章类型和发布状态查询
    @GetMapping("/serach")
    public List<ArticleVo> search(String category,String state){
        return articleVoList.stream().filter(a -> a.getCategory().equals(category) && a.getState().equals(state))
                .collect(Collectors.toList());
    }
}
