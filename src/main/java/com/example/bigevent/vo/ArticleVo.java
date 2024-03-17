package com.example.bigevent.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xi
 * @create 2024/3/17 23:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVo {
    private String title;
    private String category;
    private String time;
    private String state;
}
