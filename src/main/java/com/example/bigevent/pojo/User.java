package com.example.bigevent.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xi
 * @create 2024/3/3 17:10
 */
@Data
public class User {
    private Integer id; //主键id
    private String username;//用户名
    private String password;//密码
    private String nickname;//昵称
    private String email;//邮箱
    private String userPic;//头像
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


}
