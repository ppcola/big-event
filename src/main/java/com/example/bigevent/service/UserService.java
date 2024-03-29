package com.example.bigevent.service;

import com.example.bigevent.pojo.User;

/**
 * @author xi
 * @create 2024/3/3 18:03
 */
public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    void register(String username, String password);

    //更新
    void update(User user);

    //更新头像url
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
