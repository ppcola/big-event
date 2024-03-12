package com.example.bigevent.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xi
 * @create 2024/3/12 12:57
 */
//分页返回结果对象
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    private Long total;//总条数
    private List<T> items;//当前页数据集合
}
