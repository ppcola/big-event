package com.example.bigevent.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xi
 * @create 2024/3/3 17:45
 */
@Data
public class Category {
    private Integer id; //主键id
    private String categoryName;//分类名称
    private String categoryAlias;//别名
    private Integer createUser;//创建人id
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;//修改时间
}
