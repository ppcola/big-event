package com.example.bigevent.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xi
 * @create 2024/3/8 12:44
 */
@Data
//TODO 参数校验
public class Article {
    private Integer id; //主键id
    private String title;//文章标题
    private String content;//文章内容
    private String coverImg;//文章封面
    private String state;//文章状态(草稿1,已发布0)
    private Integer categoryId;//分类Id
    private Integer createUser;//创建人id
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;//修改时间
}
